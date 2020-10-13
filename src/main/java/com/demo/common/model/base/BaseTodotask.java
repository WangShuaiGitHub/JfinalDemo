package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTodotask<M extends BaseTodotask<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}
	
	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}
	
	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}
	
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}
	
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}
	
	public void setEmployeeid(java.lang.String employeeid) {
		set("employeeid", employeeid);
	}
	
	public java.lang.String getEmployeeid() {
		return getStr("employeeid");
	}
	
	public void setEmployeename(java.lang.String employeename) {
		set("employeename", employeename);
	}
	
	public java.lang.String getEmployeename() {
		return getStr("employeename");
	}
	
	public void setCreatedate(java.util.Date createdate) {
		set("createdate", createdate);
	}
	
	public java.util.Date getCreatedate() {
		return get("createdate");
	}
	
	public void setFinishdate(java.util.Date finishdate) {
		set("finishdate", finishdate);
	}
	
	public java.util.Date getFinishdate() {
		return get("finishdate");
	}
	
	public void setBelongid(java.lang.String belongid) {
		set("belongid", belongid);
	}
	
	public java.lang.String getBelongid() {
		return getStr("belongid");
	}
	
	public void setTodotasktype(java.lang.String todotasktype) {
		set("todotasktype", todotasktype);
	}
	
	public java.lang.String getTodotasktype() {
		return getStr("todotasktype");
	}
	
	public void setPrjid(java.lang.String prjid) {
		set("prjid", prjid);
	}
	
	public java.lang.String getPrjid() {
		return getStr("prjid");
	}
	
	public void setPrjname(java.lang.String prjname) {
		set("prjname", prjname);
	}
	
	public java.lang.String getPrjname() {
		return getStr("prjname");
	}
	
	public void setOrgid(java.lang.String orgid) {
		set("orgid", orgid);
	}
	
	public java.lang.String getOrgid() {
		return getStr("orgid");
	}
	
	public void setOrgname(java.lang.String orgname) {
		set("orgname", orgname);
	}
	
	public java.lang.String getOrgname() {
		return getStr("orgname");
	}
	
	public void setUserid(java.lang.String userid) {
		set("userid", userid);
	}
	
	public java.lang.String getUserid() {
		return getStr("userid");
	}
	
	public void setHrid(java.lang.String hrid) {
		set("hrid", hrid);
	}
	
	public java.lang.String getHrid() {
		return getStr("hrid");
	}
	
	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}
	
	public void setUrlApp(java.lang.String urlApp) {
		set("url_app", urlApp);
	}
	
	public java.lang.String getUrlApp() {
		return getStr("url_app");
	}
	
	public void setWfid(java.lang.String wfid) {
		set("wfid", wfid);
	}
	
	public java.lang.String getWfid() {
		return getStr("wfid");
	}
	
}
