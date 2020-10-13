package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePdCs<M extends BasePdCs<M>> extends Model<M> implements IBean {

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
	
	public void setPid(java.lang.String pid) {
		set("pid", pid);
	}
	
	public java.lang.String getPid() {
		return getStr("pid");
	}
	
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}
	
	public void setUserid(java.lang.String userid) {
		set("userid", userid);
	}
	
	public java.lang.String getUserid() {
		return getStr("userid");
	}
	
	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}
	
	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}
	
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}
	
	public void setSenderid(java.lang.String senderid) {
		set("senderid", senderid);
	}
	
	public java.lang.String getSenderid() {
		return getStr("senderid");
	}
	
	public void setSendername(java.lang.String sendername) {
		set("sendername", sendername);
	}
	
	public java.lang.String getSendername() {
		return getStr("sendername");
	}
	
	public void setReceivedate(java.util.Date receivedate) {
		set("receivedate", receivedate);
	}
	
	public java.util.Date getReceivedate() {
		return get("receivedate");
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
