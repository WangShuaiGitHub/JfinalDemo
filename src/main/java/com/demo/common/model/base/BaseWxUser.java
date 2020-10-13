package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWxUser<M extends BaseWxUser<M>> extends Model<M> implements IBean {

	public void setUserid(java.lang.String userid) {
		set("userid", userid);
	}
	
	public java.lang.String getUserid() {
		return getStr("userid");
	}
	
	public void setWxid(java.lang.String wxid) {
		set("wxid", wxid);
	}
	
	public java.lang.String getWxid() {
		return getStr("wxid");
	}
	
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}
	
	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}
	
	public void setGender(java.lang.String gender) {
		set("gender", gender);
	}
	
	public java.lang.String getGender() {
		return getStr("gender");
	}
	
	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}
	
	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}
	
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}
	
	public void setThumbAvatar(java.lang.String thumbAvatar) {
		set("thumb_avatar", thumbAvatar);
	}
	
	public java.lang.String getThumbAvatar() {
		return getStr("thumb_avatar");
	}
	
	public void setQrCode(java.lang.String qrCode) {
		set("qr_code", qrCode);
	}
	
	public java.lang.String getQrCode() {
		return getStr("qr_code");
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
	
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}
	
	public void setDeptname(java.lang.String deptname) {
		set("deptname", deptname);
	}
	
	public java.lang.String getDeptname() {
		return getStr("deptname");
	}
	
}
