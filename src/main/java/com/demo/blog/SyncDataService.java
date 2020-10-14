package com.demo.blog;

import com.demo.common.model.mysql.TmeTaskStandardType;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Record;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangs-as
 * @date 10/14/2020 7:19 PM
 */
public class SyncDataService {
    @Inject
    EntMingShiService entMingShiService;

    @Inject
    EntDcpService entDcpService;

    public void sysncTmeTaskType() {
        List<Record> taskType = entMingShiService.getTaskType();
        TmeTaskStandardType tmeTaskStandardTypeLast = entDcpService.getLastTypeId();
        Map<String, String> parent = new HashMap<>();
        Map<String, Integer> parentNumber = new HashMap<>();
        Map<String, TmeTaskStandardType> saveTmeTaskStandardType = new HashMap<>();
        Long lastTypeID = Long.valueOf(1);
        if (tmeTaskStandardTypeLast != null && null != tmeTaskStandardTypeLast.getTypeId()) {
            lastTypeID = tmeTaskStandardTypeLast.getTypeId() + 1;
        }
        //level 1 number define
        int i = 0;
        int number = 1;
        for (Record record : taskType) {
            String id = record.get("id");
            String pid = record.get("pid");
            String code = record.get("code").toString();
            String[] levelArray = code.split("\\.");
            int level = levelArray.length;
            Map<String, Object> columns = record.getColumns();
            parent.put(id, pid);
            Long parentID = Long.valueOf(0);
            Long typeID = lastTypeID;
            TmeTaskStandardType parentTmeTaskType = saveTmeTaskStandardType.get(pid);
            //如果含有说明是子节点, 反之挂入根目录
            String ancestor = "";
            if (!parent.containsKey(pid)) {
                i++;
                number = 1;
                parentID = Long.valueOf(0);
                typeID = lastTypeID;
            } else {
                number = parentNumber.get(pid) != null ? parentNumber.get(pid).intValue() + 1 : 1;
                parentNumber.put(pid, number);
                parentID = parentTmeTaskType.getTypeId();
                if (null == parentTmeTaskType.getAncestors() || parentTmeTaskType.getAncestors().isEmpty()) {
                    ancestor = parentID.toString();
                } else {
                    ancestor = parentTmeTaskType.getAncestors() + "," + parentID;
                }
            }

            TmeTaskStandardType tmeTaskStandardType = new TmeTaskStandardType();
            tmeTaskStandardType.setParentId(parentID);
            tmeTaskStandardType.setTypeId(typeID);
            tmeTaskStandardType.setNumber(String.valueOf(number));
            tmeTaskStandardType.setOrderNum(number);
            tmeTaskStandardType.setTypeLevel(level);
            tmeTaskStandardType.setAncestors(ancestor);
            tmeTaskStandardType.setTypeName(record.get("name"));
            tmeTaskStandardType.setCreateBy(record.get("userid"));
            tmeTaskStandardType.setUpdateBy(record.get("userid"));
            tmeTaskStandardType.setCreateTime((Date) record.get("createdate"));
            tmeTaskStandardType.setUpdateTime((Date) record.get("updatedate"));
            tmeTaskStandardType.setEntId(Long.valueOf(1));
            tmeTaskStandardType.setIsDelete(0);
            lastTypeID++;
            saveTmeTaskStandardType.put(id, tmeTaskStandardType);
            boolean result = tmeTaskStandardType.save();
            System.out.println("类型" + record.get("name") + "同步是否成功：" + result);
        }
    }

}
