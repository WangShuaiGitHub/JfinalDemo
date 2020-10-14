package com.demo.blog;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;

/**
 * @author wangs-as
 * @date 10/14/2020 3:03 PM
 */
public class EntMingShiService {
    public List<Record> getTaskType(){
        List<Record> taskType= Db.use("sqlServer").find("select * from t_tree where type='21' order by sort asc");
        return taskType;
    }
    public List<Record> getProcessType(){
        List<Record> processType= Db.use("sqlServer").find("select * from t_tree where type='24' order by sort asc");
        return processType;
    }

}
