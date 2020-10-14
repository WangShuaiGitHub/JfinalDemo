package com.demo.common.model.mysql;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MySqlMappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("business_dict", "data_id", BusinessDict.class);
		arp.addMapping("business_dict_back", "data_id", BusinessDictBack.class);
		arp.addMapping("business_dict_test", "data_id", BusinessDictTest.class);
		arp.addMapping("certificate", "cert_id", Certificate.class);
		arp.addMapping("construction_unit", "unit_id", ConstructionUnit.class);
		arp.addMapping("ent_certificate", "cert_id", EntCertificate.class);
		arp.addMapping("ent_qualification", "qual_id", EntQualification.class);
		arp.addMapping("job_log", "job_id", JobLog.class);
		arp.addMapping("om_app", "app_id", OmApp.class);
		arp.addMapping("om_menu", "menu_id", OmMenu.class);
		arp.addMapping("om_oper_log", "oper_id", OmOperLog.class);
		arp.addMapping("om_oper_user", "oper_id", OmOperUser.class);
		arp.addMapping("om_role", "role_id", OmRole.class);
		// Composite Primary Key order: menu_id,role_id
		arp.addMapping("om_role_menu", "menu_id,role_id", OmRoleMenu.class);
		// Composite Primary Key order: menu_id,role_id
		arp.addMapping("om_role_menu_default", "menu_id,role_id", OmRoleMenuDefault.class);
		// Composite Primary Key order: role_id,user_id
		arp.addMapping("om_user_role", "role_id,user_id", OmUserRole.class);
		arp.addMapping("project", "proj_id", Project.class);
		arp.addMapping("project_log", "proj_id", ProjectLog.class);
		arp.addMapping("sys_app", "app_id", SysApp.class);
		arp.addMapping("sys_dept", "dept_id", SysDept.class);
		arp.addMapping("sys_dict_data", "data_id", SysDictData.class);
		arp.addMapping("sys_dict_type", "dict_id", SysDictType.class);
		arp.addMapping("sys_ent_detail", "detail_id", SysEntDetail.class);
		// Composite Primary Key order: ent_id,proj_id
		arp.addMapping("sys_ent_project", "ent_id,proj_id", SysEntProject.class);
		arp.addMapping("sys_login_log", "login_id", SysLoginLog.class);
		arp.addMapping("sys_menu", "menu_id", SysMenu.class);
		arp.addMapping("sys_oper_log", "oper_id", SysOperLog.class);
		arp.addMapping("sys_role", "role_id", SysRole.class);
		// Composite Primary Key order: menu_id,role_id
		arp.addMapping("sys_role_menu", "menu_id,role_id", SysRoleMenu.class);
		// Composite Primary Key order: app_id,menu_id,role_id
		arp.addMapping("sys_role_menu_default", "app_id,menu_id,role_id", SysRoleMenuDefault.class);
		arp.addMapping("sys_user", "user_id", SysUser.class);
		// Composite Primary Key order: dept_id,user_id
		arp.addMapping("sys_user_dept", "dept_id,user_id", SysUserDept.class);
		arp.addMapping("sys_user_detail", "detail_id", SysUserDetail.class);
		arp.addMapping("sys_user_log", "log_id", SysUserLog.class);
		// Composite Primary Key order: proj_id,user_id
		arp.addMapping("sys_user_project", "proj_id,user_id", SysUserProject.class);
		// Composite Primary Key order: ent_id,role_id,user_id
		arp.addMapping("sys_user_role", "ent_id,role_id,user_id", SysUserRole.class);
		arp.addMapping("sys_user_work", "work_id", SysUserWork.class);
		arp.addMapping("tm_approval", "appr_id", TmApproval.class);
		arp.addMapping("tm_approval_flow", "flow_id", TmApprovalFlow.class);
		arp.addMapping("tm_approval_log", "log_id", TmApprovalLog.class);
		arp.addMapping("tme_attachment", "file_id", TmeAttachment.class);
		arp.addMapping("tme_process", "prc_id", TmeProcess.class);
		// Composite Primary Key order: prc_id,task_id
		arp.addMapping("tme_process_task", "prc_id,task_id", TmeProcessTask.class);
		arp.addMapping("tme_process_type", "type_id", TmeProcessType.class);
		arp.addMapping("tme_rich_text", "file_id", TmeRichText.class);
		arp.addMapping("tme_task_standard", "task_id", TmeTaskStandard.class);
		arp.addMapping("tme_task_standard_detail", "detail_id", TmeTaskStandardDetail.class);
		arp.addMapping("tme_task_standard_type", "type_id", TmeTaskStandardType.class);
		arp.addMapping("tmp_process", "prc_id", TmpProcess.class);
		// Composite Primary Key order: prc_id,task_id
		arp.addMapping("tmp_process_task", "prc_id,task_id", TmpProcessTask.class);
		arp.addMapping("tmp_process_type", "type_id", TmpProcessType.class);
		arp.addMapping("tmp_task_standard", "task_id", TmpTaskStandard.class);
		arp.addMapping("tmp_task_standard_detail", "detail_id", TmpTaskStandardDetail.class);
		arp.addMapping("tmp_task_standard_type", "type_id", TmpTaskStandardType.class);
		arp.addMapping("upload_file", "file_id", UploadFile.class);
		arp.addMapping("xmgl_org_info", "org_id", XmglOrgInfo.class);
		arp.addMapping("xmgl_user", "auto_id", XmglUser.class);
	}
}

