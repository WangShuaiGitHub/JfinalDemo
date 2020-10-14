package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseXmglOrgInfo<M extends BaseXmglOrgInfo<M>> extends Model<M> implements IBean {

	/**
	 * 组织ID
	 */
	public void setOrgId(java.lang.Long orgId) {
		set("org_id", orgId);
	}
	
	/**
	 * 组织ID
	 */
	public java.lang.Long getOrgId() {
		return getLong("org_id");
	}
	
	/**
	 * 组织父ID
	 */
	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}
	
	/**
	 * 组织父ID
	 */
	public java.lang.Long getParentId() {
		return getLong("parent_id");
	}
	
	/**
	 * 组织名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 组织名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}
	
	/**
	 * 统一社会信用代码
	 */
	public void setCreditCode(java.lang.String creditCode) {
		set("credit_code", creditCode);
	}
	
	/**
	 * 统一社会信用代码
	 */
	public java.lang.String getCreditCode() {
		return getStr("credit_code");
	}
	
	/**
	 * 产品开通状态
	 */
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	/**
	 * 产品开通状态
	 */
	public java.lang.String getStatus() {
		return getStr("status");
	}
	
	/**
	 * 组织类型
	 */
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	/**
	 * 组织类型
	 */
	public java.lang.String getType() {
		return getStr("type");
	}
	
	/**
	 * 排序
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序
	 */
	public java.lang.Integer getSort() {
		return getInt("sort");
	}
	
	/**
	 * 项目指挥部下面的引用项目的真实ID
	 */
	public void setRealId(java.lang.String realId) {
		set("real_id", realId);
	}
	
	/**
	 * 项目指挥部下面的引用项目的真实ID
	 */
	public java.lang.String getRealId() {
		return getStr("real_id");
	}
	
	/**
	 * 项目ID
	 */
	public void setProjectId(java.lang.Long projectId) {
		set("project_id", projectId);
	}
	
	/**
	 * 项目ID
	 */
	public java.lang.Long getProjectId() {
		return getLong("project_id");
	}
	
	/**
	 * 项目状态
	 */
	public void setProjectStatus(java.lang.Integer projectStatus) {
		set("project_status", projectStatus);
	}
	
	/**
	 * 项目状态
	 */
	public java.lang.Integer getProjectStatus() {
		return getInt("project_status");
	}
	
	/**
	 * 组织ID全路径
	 */
	public void setFullId(java.lang.String fullId) {
		set("full_id", fullId);
	}
	
	/**
	 * 组织ID全路径
	 */
	public java.lang.String getFullId() {
		return getStr("full_id");
	}
	
	/**
	 * 组织名称全路径
	 */
	public void setFullName(java.lang.String fullName) {
		set("full_name", fullName);
	}
	
	/**
	 * 组织名称全路径
	 */
	public java.lang.String getFullName() {
		return getStr("full_name");
	}
	
	/**
	 * 是否有选择权限
	 */
	public void setCanSelect(java.lang.Integer canSelect) {
		set("can_select", canSelect);
	}
	
	/**
	 * 是否有选择权限
	 */
	public java.lang.Integer getCanSelect() {
		return getInt("can_select");
	}
	
	/**
	 * true 是 一般项目/搅拌站 false 反之
	 */
	public void setProject(java.lang.Integer project) {
		set("project", project);
	}
	
	/**
	 * true 是 一般项目/搅拌站 false 反之
	 */
	public java.lang.Integer getProject() {
		return getInt("project");
	}
	
	/**
	 * 是否是继承的权限
	 */
	public void setInheritPermission(java.lang.Integer inheritPermission) {
		set("inherit_permission", inheritPermission);
	}
	
	/**
	 * 是否是继承的权限
	 */
	public java.lang.Integer getInheritPermission() {
		return getInt("inherit_permission");
	}
	
	/**
	 * 项目简称
	 */
	public void setShortName(java.lang.String shortName) {
		set("short_name", shortName);
	}
	
	/**
	 * 项目简称
	 */
	public java.lang.String getShortName() {
		return getStr("short_name");
	}
	
	/**
	 * 占无字段注释
	 */
	public void setProjectInfo(java.lang.String projectInfo) {
		set("project_info", projectInfo);
	}
	
	/**
	 * 占无字段注释
	 */
	public java.lang.String getProjectInfo() {
		return getStr("project_info");
	}
	
	/**
	 * 是否删除 0、否 1、是
	 */
	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	/**
	 * 是否删除 0、否 1、是
	 */
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}
	
	/**
	 * 创建者
	 */
	public void setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
	}
	
	/**
	 * 创建者
	 */
	public java.lang.String getCreateBy() {
		return getStr("create_by");
	}
	
	/**
	 * 创建时间
	 */
	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}
	
	/**
	 * 更新者
	 */
	public void setUpdateBy(java.lang.String updateBy) {
		set("update_by", updateBy);
	}
	
	/**
	 * 更新者
	 */
	public java.lang.String getUpdateBy() {
		return getStr("update_by");
	}
	
	/**
	 * 更新时间
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	/**
	 * 更新时间
	 */
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}
	
}
