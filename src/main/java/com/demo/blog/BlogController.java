package com.demo.blog;

import com.demo.common.model.User;
import com.demo.common.model.base.BaseUser;
import com.demo.common.model.mysql.TmeTaskStandardType;
import com.demo.common.model.mysql.TmpTaskStandard;
import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.demo.common.model.Blog;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

import java.util.*;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * <p>
 * 所有 sql 与业务逻辑写在 Service 中，不要放在 Model 中，更不
 * 要放在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {

    @Inject
    BlogService service;

    @Inject
    UserService userService;

    @Inject
    EntMingShiService entMingShiService;

    @Inject
    EntDcpService entDcpService;

    public void index() {
//		Page<Blog> blocks =  service.paginate(getParaToInt(0, 1), 10);
//		List<User> blocks =  userService.getAll();
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
            tmeTaskStandardType.setCreateBy(record.get("userId"));
            tmeTaskStandardType.setUpdateBy(record.get("userId"));
            tmeTaskStandardType.setCreateTime(new Date());
            tmeTaskStandardType.setUpdateTime(new Date());
            tmeTaskStandardType.setEntId(Long.valueOf(1));
            tmeTaskStandardType.setIsDelete(0);
            lastTypeID++;
            saveTmeTaskStandardType.put(id, tmeTaskStandardType);
            boolean result = tmeTaskStandardType.save();
            System.out.println("类型" + record.get("name") + "同步是否成功：" + result);
        }
//		List<TmpTaskStandard> tmpTaskStandards = userService.getTmpTaskStandard();
//		List<Record> test = Db.use("mysql").find("select * from tmp_task_standard");
//		for(User user: blocks){
//			System.out.println(user.getDeptname());
//			System.out.println(user.getMobile());
////			System.out.println(user.getDeptname());
////			System.out.println(user.getDeptname());
//		}
//		setAttr("blogPage", blocks);
//		render("blog.html");
    }

    public void add() {
    }

    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    @Before(BlogValidator.class)
    public void save() {
        getBean(Blog.class).save();
        redirect("/blog");
    }

    public void edit() {
        setAttr("blog", service.findById(getParaToInt()));
    }

    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    @Before(BlogValidator.class)
    public void update() {
        getBean(Blog.class).update();
        redirect("/blog");
    }

    public void delete() {
        service.deleteById(getParaToInt());
        redirect("/blog");
    }
}


