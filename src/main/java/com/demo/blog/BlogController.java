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
	SyncDataService syncDataService;

    public void index() {
        //同步企业 标准任务类型 type
		syncDataService.sysncTmeTaskType();
        //同步项目工序 type
		syncDataService.sysncTmpProcessType();
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


