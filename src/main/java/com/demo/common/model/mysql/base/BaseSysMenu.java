package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysMenu<M extends BaseSysMenu<M>> extends Model<M> implements IBean {

	/**
	 * 菜单ID
	 */
	public void setMenuId(java.lang.Long menuId) {
		set("menu_id", menuId);
	}
	
	/**
	 * 菜单ID
	 */
	public java.lang.Long getMenuId() {
		return getLong("menu_id");
	}
	
	/**
	 * 菜单名称
	 */
	public void setMenuName(java.lang.String menuName) {
		set("menu_name", menuName);
	}
	
	/**
	 * 菜单名称
	 */
	public java.lang.String getMenuName() {
		return getStr("menu_name");
	}
	
	/**
	 * 父菜单ID
	 */
	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}
	
	/**
	 * 父菜单ID
	 */
	public java.lang.Long getParentId() {
		return getLong("parent_id");
	}
	
	/**
	 * 显示顺序
	 */
	public void setOrderNum(java.lang.Integer orderNum) {
		set("order_num", orderNum);
	}
	
	/**
	 * 显示顺序
	 */
	public java.lang.Integer getOrderNum() {
		return getInt("order_num");
	}
	
	/**
	 * 请求地址
	 */
	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	/**
	 * 请求地址
	 */
	public java.lang.String getUrl() {
		return getStr("url");
	}
	
	/**
	 * 打开方式（menuItem页签 menuBlank新窗口）
	 */
	public void setTarget(java.lang.String target) {
		set("target", target);
	}
	
	/**
	 * 打开方式（menuItem页签 menuBlank新窗口）
	 */
	public java.lang.String getTarget() {
		return getStr("target");
	}
	
	/**
	 * 菜单类型（M目录 C菜单 F按钮）
	 */
	public void setMenuType(java.lang.String menuType) {
		set("menu_type", menuType);
	}
	
	/**
	 * 菜单类型（M目录 C菜单 F按钮）
	 */
	public java.lang.String getMenuType() {
		return getStr("menu_type");
	}
	
	/**
	 * 菜单状态（0显示 1隐藏）
	 */
	public void setVisible(java.lang.String visible) {
		set("visible", visible);
	}
	
	/**
	 * 菜单状态（0显示 1隐藏）
	 */
	public java.lang.String getVisible() {
		return getStr("visible");
	}
	
	/**
	 * 权限标识
	 */
	public void setPerms(java.lang.String perms) {
		set("perms", perms);
	}
	
	/**
	 * 权限标识
	 */
	public java.lang.String getPerms() {
		return getStr("perms");
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
	 * 菜单图标
	 */
	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	/**
	 * 菜单图标
	 */
	public java.lang.String getIcon() {
		return getStr("icon");
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
	 * 类型id
	 */
	public void setAppId(java.lang.Long appId) {
		set("app_id", appId);
	}
	
	/**
	 * 类型id
	 */
	public java.lang.Long getAppId() {
		return getLong("app_id");
	}
	
}
