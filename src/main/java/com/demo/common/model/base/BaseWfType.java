package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWfType<M extends BaseWfType<M>> extends Model<M> implements IBean {

	public void setTypeid(java.lang.Integer typeid) {
		set("typeid", typeid);
	}
	
	public java.lang.Integer getTypeid() {
		return getInt("typeid");
	}
	
	public void setTypename(java.lang.String typename) {
		set("typename", typename);
	}
	
	public java.lang.String getTypename() {
		return getStr("typename");
	}
	
}
