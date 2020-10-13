package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCompany<M extends BaseCompany<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}
	
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}
	
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}
	
	public void setAdmcode(java.lang.String admcode) {
		set("admcode", admcode);
	}
	
	public java.lang.String getAdmcode() {
		return getStr("admcode");
	}
	
	public void setAdmname(java.lang.String admname) {
		set("admname", admname);
	}
	
	public java.lang.String getAdmname() {
		return getStr("admname");
	}
	
	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}
	
	public void setStartdate(java.util.Date startdate) {
		set("startdate", startdate);
	}
	
	public java.util.Date getStartdate() {
		return get("startdate");
	}
	
	public void setEnddate(java.util.Date enddate) {
		set("enddate", enddate);
	}
	
	public java.util.Date getEnddate() {
		return get("enddate");
	}
	
	public void setLon(java.lang.Double lon) {
		set("lon", lon);
	}
	
	public java.lang.Double getLon() {
		return getDouble("lon");
	}
	
	public void setLat(java.lang.Double lat) {
		set("lat", lat);
	}
	
	public java.lang.Double getLat() {
		return getDouble("lat");
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
	
	public void setQdh(java.lang.String qdh) {
		set("qdh", qdh);
	}
	
	public java.lang.String getQdh() {
		return getStr("qdh");
	}
	
}
