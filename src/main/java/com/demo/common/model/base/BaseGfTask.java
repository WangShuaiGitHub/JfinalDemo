package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGfTask<M extends BaseGfTask<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}
	
	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}
	
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}
	
	public void setPrevtask(java.lang.String prevtask) {
		set("prevtask", prevtask);
	}
	
	public java.lang.String getPrevtask() {
		return getStr("prevtask");
	}
	
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}
	
	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
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
	
	public void setBelongid(java.lang.String belongid) {
		set("belongid", belongid);
	}
	
	public java.lang.String getBelongid() {
		return getStr("belongid");
	}
	
	public void setPrjid(java.lang.String prjid) {
		set("prjid", prjid);
	}
	
	public java.lang.String getPrjid() {
		return getStr("prjid");
	}
	
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	public java.lang.Integer getSort() {
		return getInt("sort");
	}
	
	public void setBzpz(java.lang.String bzpz) {
		set("bzpz", bzpz);
	}
	
	public java.lang.String getBzpz() {
		return getStr("bzpz");
	}
	
	public void setJldw(java.lang.String jldw) {
		set("jldw", jldw);
	}
	
	public java.lang.String getJldw() {
		return getStr("jldw");
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
	
	public void setZybz(java.lang.String zybz) {
		set("zybz", zybz);
	}
	
	public java.lang.String getZybz() {
		return getStr("zybz");
	}
	
	public void setZlbz(java.lang.String zlbz) {
		set("zlbz", zlbz);
	}
	
	public java.lang.String getZlbz() {
		return getStr("zlbz");
	}
	
	public void setAqyq(java.lang.String aqyq) {
		set("aqyq", aqyq);
	}
	
	public java.lang.String getAqyq() {
		return getStr("aqyq");
	}
	
	public void setTbfz(java.lang.String tbfz) {
		set("tbfz", tbfz);
	}
	
	public java.lang.String getTbfz() {
		return getStr("tbfz");
	}
	
	public void setCyzf(java.lang.String cyzf) {
		set("cyzf", cyzf);
	}
	
	public java.lang.String getCyzf() {
		return getStr("cyzf");
	}
	
	public void setLssg(java.lang.String lssg) {
		set("lssg", lssg);
	}
	
	public java.lang.String getLssg() {
		return getStr("lssg");
	}
	
	public void setJcff(java.lang.String jcff) {
		set("jcff", jcff);
	}
	
	public java.lang.String getJcff() {
		return getStr("jcff");
	}
	
	public void setJcpl(java.lang.String jcpl) {
		set("jcpl", jcpl);
	}
	
	public java.lang.String getJcpl() {
		return getStr("jcpl");
	}
	
	public void setXgjl(java.lang.String xgjl) {
		set("xgjl", xgjl);
	}
	
	public java.lang.String getXgjl() {
		return getStr("xgjl");
	}
	
	public void setGznr(java.lang.String gznr) {
		set("gznr", gznr);
	}
	
	public java.lang.String getGznr() {
		return getStr("gznr");
	}
	
	public void setDcph(java.lang.String dcph) {
		set("dcph", dcph);
	}
	
	public java.lang.String getDcph() {
		return getStr("dcph");
	}
	
	public void setDegs(java.lang.String degs) {
		set("degs", degs);
	}
	
	public java.lang.String getDegs() {
		return getStr("degs");
	}
	
	public void setJzgs(java.lang.String jzgs) {
		set("jzgs", jzgs);
	}
	
	public java.lang.String getJzgs() {
		return getStr("jzgs");
	}
	
	public void setBzmc(java.lang.String bzmc) {
		set("bzmc", bzmc);
	}
	
	public java.lang.String getBzmc() {
		return getStr("bzmc");
	}
	
	public void setJsgz(java.lang.String jsgz) {
		set("jsgz", jsgz);
	}
	
	public java.lang.String getJsgz() {
		return getStr("jsgz");
	}
	
	public void setBz(java.lang.String bz) {
		set("bz", bz);
	}
	
	public java.lang.String getBz() {
		return getStr("bz");
	}
	
}
