package com.action;


import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TWenjuanDAO;
import com.opensymphony.xwork2.ActionSupport;

public class indexAction extends ActionSupport
{
	private TWenjuanDAO wenjuanDAO;
	
	public TWenjuanDAO getWenjuanDAO()
	{
		return wenjuanDAO;
	}

	public void setWenjuanDAO(TWenjuanDAO wenjuanDAO)
	{
		this.wenjuanDAO = wenjuanDAO;
	}

	public String index()
	{
		Map request=(Map)ServletActionContext.getContext().get("request");
		
		String sql="from TWenjuan";
		List wenjuanList =wenjuanDAO.getHibernateTemplate().find(sql);
		request.put("wenjuanList", wenjuanList);
		
		return ActionSupport.SUCCESS;
	}

}
