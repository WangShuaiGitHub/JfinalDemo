package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRole<M extends BaseSysRole<M>> extends Model<M> implements IBean {

	/**
	 * 角色ID
	 */
	public void setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
	}
	
	/**
	 * 角色ID
	 */
	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}
	
	/**
	 * 角色名称
	 */
	public void setRoleName(java.lang.String roleName) {
		set("role_name", roleName);
	}
	
	/**
	 * 角色名称
	 */
	public java.lang.String getRoleName() {
		return getStr("role_name");
	}
	
	/**
	 * 显示顺序
	 */
	public void setRoleSort(java.lang.Integer roleSort) {
		set("role_sort", roleSort);
	}
	
	/**
	 * 显示顺序
	 */
	public java.lang.Integer getRoleSort() {
		return getInt("role_sort");
	}
	
	/**
	 * 角色状态（0正常 1停用）
	 */
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	/**
	 * 角色状态（0正常 1停用）
	 */
	public java.lang.String getStatus() {
		return getStr("status");
	}
	
	/**
	 * 备注
	 */
	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getRemark() {
		return getStr("remark");
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
	
	/**
	 * 是否系统默认
	 */
	public void setIsDefault(java.lang.String isDefault) {
		set("is_default", isDefault);
	}
	
	/**
	 * 是否系统默认
	 */
	public java.lang.String getIsDefault() {
		return getStr("is_default");
	}
	
	/**
	 * 类型ID
	 */
	public void setAppId(java.lang.Long appId) {
		set("app_id", appId);
	}
	
	/**
	 * 类型ID
	 */
	public java.lang.Long getAppId() {
		return getLong("app_id");
	}
	
	/**
	 * 系统默认角色ID
	 */
	public void setDefaultRoleId(java.lang.Long defaultRoleId) {
		set("default_role_id", defaultRoleId);
	}
	
	/**
	 * 系统默认角色ID
	 */
	public java.lang.Long getDefaultRoleId() {
		return getLong("default_role_id");
	}
	
}
