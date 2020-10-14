package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTmpProcess<M extends BaseTmpProcess<M>> extends Model<M> implements IBean {

	/**
	 * 工序ID
	 */
	public void setPrcId(java.lang.Long prcId) {
		set("prc_id", prcId);
	}
	
	/**
	 * 工序ID
	 */
	public java.lang.Long getPrcId() {
		return getLong("prc_id");
	}
	
	/**
	 * 项目ID
	 */
	public void setProjId(java.lang.Long projId) {
		set("proj_id", projId);
	}
	
	/**
	 * 项目ID
	 */
	public java.lang.Long getProjId() {
		return getLong("proj_id");
	}
	
	/**
	 * 企业ID
	 */
	public void setEntId(java.lang.Long entId) {
		set("ent_id", entId);
	}
	
	/**
	 * 企业ID
	 */
	public java.lang.Long getEntId() {
		return getLong("ent_id");
	}
	
	/**
	 * 对应的企业工序ID
	 */
	public void setEntPrcId(java.lang.Long entPrcId) {
		set("ent_prc_id", entPrcId);
	}
	
	/**
	 * 对应的企业工序ID
	 */
	public java.lang.Long getEntPrcId() {
		return getLong("ent_prc_id");
	}
	
	/**
	 * 工序编号
	 */
	public void setNumber(java.lang.String number) {
		set("number", number);
	}
	
	/**
	 * 工序编号
	 */
	public java.lang.String getNumber() {
		return getStr("number");
	}
	
	/**
	 * 工序名称
	 */
	public void setPrcName(java.lang.String prcName) {
		set("prc_name", prcName);
	}
	
	/**
	 * 工序名称
	 */
	public java.lang.String getPrcName() {
		return getStr("prc_name");
	}
	
	/**
	 * 前置任务类型
	 */
	public void setPreposeType(java.lang.String preposeType) {
		set("prepose_type", preposeType);
	}
	
	/**
	 * 前置任务类型
	 */
	public java.lang.String getPreposeType() {
		return getStr("prepose_type");
	}
	
	/**
	 * 工序类型 1、企业标准2、项目新增3、项目优化
	 */
	public void setPrcType(java.lang.String prcType) {
		set("prc_type", prcType);
	}
	
	/**
	 * 工序类型 1、企业标准2、项目新增3、项目优化
	 */
	public java.lang.String getPrcType() {
		return getStr("prc_type");
	}
	
	/**
	 * 延迟时间
	 */
	public void setDelayTime(java.util.Date delayTime) {
		set("delay_time", delayTime);
	}
	
	/**
	 * 延迟时间
	 */
	public java.util.Date getDelayTime() {
		return get("delay_time");
	}
	
	/**
	 * 状态
	 */
	public void setState(java.lang.String state) {
		set("state", state);
	}
	
	/**
	 * 状态
	 */
	public java.lang.String getState() {
		return getStr("state");
	}
	
	/**
	 * 修改原因
	 */
	public void setUpdateCause(java.lang.String updateCause) {
		set("update_cause", updateCause);
	}
	
	/**
	 * 修改原因
	 */
	public java.lang.String getUpdateCause() {
		return getStr("update_cause");
	}
	
	/**
	 * 反馈结果  1、已上报  2、已驳回  3、已接受
	 */
	public void setFeedback(java.lang.String feedback) {
		set("feedback", feedback);
	}
	
	/**
	 * 反馈结果  1、已上报  2、已驳回  3、已接受
	 */
	public java.lang.String getFeedback() {
		return getStr("feedback");
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
