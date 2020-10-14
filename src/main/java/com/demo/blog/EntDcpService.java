package com.demo.blog;

import com.demo.common.model.mysql.TmeTaskStandardType;

import static com.jfinal.plugin.activerecord.Db.findFirst;

/**
 * @author wangs-as
 * @date 10/14/2020 4:15 PM
 */
public class EntDcpService {
    private TmeTaskStandardType tmeTaskStandardType = new TmeTaskStandardType().dao();

    public void insertTmeTasktype(TmeTaskStandardType taskStandardType){
        taskStandardType.save();
    }

    public TmeTaskStandardType getLastTypeId(){
        TmeTaskStandardType taskStandardTypeFirst = tmeTaskStandardType.findFirst("select * from tme_task_standard_type order by type_id desc limit 1");
        return taskStandardTypeFirst;
    }

    public void deleteTmeType(){
        String sql = "truncate table tme_task_standard_type";
//        tmeTaskStandardType.d
    }
}
