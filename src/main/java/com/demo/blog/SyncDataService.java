package com.demo.blog;

import cn.hutool.core.util.StrUtil;
import com.demo.common.model.mysql.TmeTaskStandardType;
import com.demo.common.model.mysql.TmpProcessType;
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
        Map<String, Integer> parentOrderNumber = new HashMap<>();
        Map<String, String> parentNumber = new HashMap<>();
        Map<String, String> parent2Number = new HashMap<>();
        Map<String, TmeTaskStandardType> saveTmeTaskStandardType = new HashMap<>();
        Long lastTypeID = Long.valueOf(1);
        if (tmeTaskStandardTypeLast != null && null != tmeTaskStandardTypeLast.getTypeId()) {
            lastTypeID = tmeTaskStandardTypeLast.getTypeId() + 1;
        }
        //level 1 number define
        int i = 0;
        int orderNumber = 1;
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
            String number = "";
            if (!parent.containsKey(pid)) {
                //不含有，是一级节点
                orderNumber = ++i;
                parentID = Long.valueOf(0);
                typeID = lastTypeID;
                number = String.valueOf(orderNumber);
            } else {
                orderNumber = parentOrderNumber.get(pid) != null ? parentOrderNumber.get(pid).intValue() + 1 : 1;
                parentOrderNumber.put(pid, orderNumber);

                parentID = parentTmeTaskType.getTypeId();
                if (null == parentTmeTaskType.getAncestors() || parentTmeTaskType.getAncestors().isEmpty()) {
                    ancestor = parentID.toString();
                } else {
                    ancestor = parentTmeTaskType.getAncestors() + "," + parentID;
                }
                number = parentNumber.get(pid);

                int temp = 0;
                if(parent2Number.containsKey(pid)){
                    temp ++;
                }
                parent2Number.put(pid, String.valueOf(temp));
                if(parent2Number.get(pid).equals("0")){
                    number = StrUtil.format("{}-{}", number, "1");
                }else{
                    number = StrUtil.format("{}-{}", number, orderNumber);
                }
            }
            parentNumber.put(id, number);

            TmeTaskStandardType tmeTaskStandardType = new TmeTaskStandardType();
            tmeTaskStandardType.setParentId(parentID);
            tmeTaskStandardType.setTypeId(typeID);
            tmeTaskStandardType.setNumber(String.valueOf(number));
            tmeTaskStandardType.setOrderNum(orderNumber);
            tmeTaskStandardType.setTypeLevel(level);
            tmeTaskStandardType.setAncestors(ancestor);
            tmeTaskStandardType.setOldId(id);
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
            System.out.println("标准任务类型" + record.get("name") + "同步是否成功：" + result);
        }
    }

    public void sysncTmpProcessType() {
        List<Record> taskType = entMingShiService.getProcessType();
        TmpProcessType tmpProcessType = entDcpService.getLastProcessTypeId();
        Map<String, String> parent = new HashMap<>();
        Map<String, Integer> parentOrderNumber = new HashMap<>();
        Map<String, String> parentNumber = new HashMap<>();
        Map<String, String> parent2Number = new HashMap<>();
        Map<String, TmpProcessType> saveTmpProcessType = new HashMap<>();
        Long lastTypeID = Long.valueOf(1);
        if (tmpProcessType != null && null != tmpProcessType.getTypeId()) {
            lastTypeID = tmpProcessType.getTypeId() + 1;
        }
        //level 1 number define
        int i = 0;
        int orderNumber = 1;
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
            TmpProcessType parentProcessType = saveTmpProcessType.get(pid);
            //如果含有说明是子节点, 反之挂入根目录
            String ancestor = "";
            String number = "";
            if (!parent.containsKey(pid)) {
                //不含有，是一级节点
                orderNumber = ++i;
                parentID = Long.valueOf(0);
                typeID = lastTypeID;
                number = String.valueOf(orderNumber);
            } else {
                orderNumber = parentOrderNumber.get(pid) != null ? parentOrderNumber.get(pid).intValue() + 1 : 1;
                parentOrderNumber.put(pid, orderNumber);

                parentID = parentProcessType.getTypeId();
                if (null == parentProcessType.getAncestors() || parentProcessType.getAncestors().isEmpty()) {
                    ancestor = parentID.toString();
                } else {
                    ancestor = parentProcessType.getAncestors() + "," + parentID;
                }
                number = parentNumber.get(pid);

                int temp = 0;
                if(parent2Number.containsKey(pid)){
                    temp ++;
                }
                parent2Number.put(pid, String.valueOf(temp));
                if(parent2Number.get(pid).equals("0")){
                    number = StrUtil.format("{}-{}", number, "1");
                }else{
                    number = StrUtil.format("{}-{}", number, orderNumber);
                }
            }
            parentNumber.put(id, number);

            TmpProcessType processType = new TmpProcessType();
            processType.setParentId(parentID);
            processType.setTypeId(typeID);
            processType.setNumber(String.valueOf(number));
            processType.setOrderNum(orderNumber);
            processType.setTypeLevel(level);
            processType.setAncestors(ancestor);
            processType.setOldId(id);
            processType.setTypeName(record.get("name"));
            processType.setCreateBy(record.get("userid"));
            processType.setUpdateBy(record.get("userid"));
            processType.setCreateTime((Date) record.get("createdate"));
            processType.setUpdateTime((Date) record.get("updatedate"));
            processType.setEntId(Long.valueOf(1));
            processType.setIsDelete(0);
            lastTypeID++;
            saveTmpProcessType.put(id, processType);
            boolean result = processType.save();
            System.out.println("项目工序类型" + record.get("name") + "同步是否成功：" + result);
        }
    }

}
