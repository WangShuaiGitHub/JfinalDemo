package com.demo.common.model.mysql.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTmpTaskStandardDetail<M extends BaseTmpTaskStandardDetail<M>> extends Model<M> implements IBean {

	/**
	 * 任务标准详情ID
	 */
	public void setDetailId(java.lang.Long detailId) {
		set("detail_id", detailId);
	}
	
	/**
	 * 任务标准详情ID
	 */
	public java.lang.Long getDetailId() {
		return getLong("detail_id");
	}
	
	/**
	 * 任务标准ID
	 */
	public void setTaskId(java.lang.Long taskId) {
		set("task_id", taskId);
	}
	
	/**
	 * 任务标准ID
	 */
	public java.lang.Long getTaskId() {
		return getLong("task_id");
	}
	
	/**
	 * 工序作业标准
	 */
	public void setProcessWork(java.lang.String processWork) {
		set("process_work", processWork);
	}
	
	/**
	 * 工序作业标准
	 */
	public java.lang.String getProcessWork() {
		return getStr("process_work");
	}
	
	/**
	 * 质量验收标准
	 */
	public void setQualityCheck(java.lang.String qualityCheck) {
		set("quality_check", qualityCheck);
	}
	
	/**
	 * 质量验收标准
	 */
	public java.lang.String getQualityCheck() {
		return getStr("quality_check");
	}
	
	/**
	 * 安全要求
	 */
	public void setSafeAsk(java.lang.String safeAsk) {
		set("safe_ask", safeAsk);
	}
	
	/**
	 * 安全要求
	 */
	public java.lang.String getSafeAsk() {
		return getStr("safe_ask");
	}
	
	/**
	 * 督查或配合岗位
	 */
	public void setRecheckPost(java.lang.String recheckPost) {
		set("recheck_post", recheckPost);
	}
	
	/**
	 * 督查或配合岗位
	 */
	public java.lang.String getRecheckPost() {
		return getStr("recheck_post");
	}
	
	/**
	 * 检测方法
	 */
	public void setCheckWay(java.lang.String checkWay) {
		set("check_way", checkWay);
	}
	
	/**
	 * 检测方法
	 */
	public java.lang.String getCheckWay() {
		return getStr("check_way");
	}
	
	/**
	 * 监测频率
	 */
	public void setMonitorRate(java.lang.String monitorRate) {
		set("monitor_rate", monitorRate);
	}
	
	/**
	 * 监测频率
	 */
	public java.lang.String getMonitorRate() {
		return getStr("monitor_rate");
	}
	
	/**
	 * 相关记录
	 */
	public void setRecord(java.lang.String record) {
		set("record", record);
	}
	
	/**
	 * 相关记录
	 */
	public java.lang.String getRecord() {
		return getStr("record");
	}
	
}
