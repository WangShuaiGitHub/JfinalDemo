package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOmUserRole<M extends BaseOmUserRole<M>> extends Model<M> implements IBean {

	/**
	 * 用户ID
	 */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户ID
	 */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}
	
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
	
}
