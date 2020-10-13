package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGfDetailTask<M extends BaseGfDetailTask<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}
	
	public void setBelongid(java.lang.String belongid) {
		set("belongid", belongid);
	}
	
	public java.lang.String getBelongid() {
		return getStr("belongid");
	}
	
	public void setSourceid(java.lang.String sourceid) {
		set("sourceid", sourceid);
	}
	
	public java.lang.String getSourceid() {
		return getStr("sourceid");
	}
	
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}
	
	public void setHh(java.lang.Integer hh) {
		set("hh", hh);
	}
	
	public java.lang.Integer getHh() {
		return getInt("hh");
	}
	
	public void setCreatedate(java.util.Date createdate) {
		set("createdate", createdate);
	}
	
	public java.util.Date getCreatedate() {
		return get("createdate");
	}
	
	public void setUpdatedate(java.util.Date updatedate) {
		set("updatedate", updatedate);
	}
	
	public java.util.Date getUpdatedate() {
		return get("updatedate");
	}
	
}
