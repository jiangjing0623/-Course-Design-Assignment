package com.action;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TToupiaoDAO;
import com.dao.TToupiaoxuanxiangDAO;
import com.dao.TWenjuanDAO;
import com.model.TAdmin;
import com.model.TGonggao;
import com.model.TToupiao;
import com.model.TWenjuan;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class wenjuanAction extends ActionSupport
{
	private String id;
	private String mingcheng;
	
	private String message;
	private String path;
	
	private TWenjuanDAO wenjuanDAO;
	private TToupiaoDAO toupiaoDAO;
	private TToupiaoxuanxiangDAO toupiaoxuanxiangDAO;
	
	public String wenjuanAdd()
	{
		TWenjuan wenjuan=new TWenjuan();
		
		wenjuan.setId(String.valueOf(new Date().getTime()));
		wenjuan.setMingcheng(mingcheng);
		wenjuan.setShijian(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		wenjuanDAO.save(wenjuan);
		this.setMessage("添加完毕");
		this.setPath("wenjuanMana.action");
		return "succeed";
	}
	
	
	public String wenjuanMana()
	{
		String sql="from TWenjuan";
		List wenjuanList =wenjuanDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("wenjuanList", wenjuanList);
		return ActionSupport.SUCCESS;
	}
	
	public String wenjuanDel()
	{
		TWenjuan wenjuan=wenjuanDAO.findById(id);
		wenjuanDAO.delete(wenjuan);
		this.setMessage("删除完毕");
		this.setPath("wenjuanMana.action");
		return "succeed";
	}
	
	
	public String wenjuan_search()
	{
		String sql="from TWenjuan where mingcheng like '%"+mingcheng.trim()+"%'";
		List wenjuanList =wenjuanDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("wenjuanList", wenjuanList);
		return ActionSupport.SUCCESS;
	}
	
	public String wenjuanDetailQian()
	{
		TWenjuan wenjuan=wenjuanDAO.findById(id);
		
		String sql="from TToupiao where wenjuan_id="+wenjuan.getId();
		List toupiaoList=toupiaoDAO.getHibernateTemplate().find(sql);
		for(int i=0;i<toupiaoList.size();i++)
		{
			TToupiao toupiao=(TToupiao)toupiaoList.get(i);
			String sql11="from TToupiaoxuanxiang where toupiao_id="+toupiao.getId();
			List xuanxiangList=toupiaoxuanxiangDAO.getHibernateTemplate().find(sql11);
			toupiao.setXuanxiangList(xuanxiangList);
		}
		
		wenjuan.setToupiaoList(toupiaoList);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("wenjuan", wenjuan);
		return ActionSupport.SUCCESS;
		
	}

	
	public String wenjuan_canyu()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String xxxxx=request.getParameter("xxxxx");
		System.out.println(xxxxx+"^^^^");

        
		String[] s=xxxxx.split(",");
		for(int i=0;i<s.length;i++)
		{
			String xuanxiang_id=request.getParameter(s[i]);
			String sql="update TToupiaoxuanxiang set piaoshu=piaoshu+1 where id="+xuanxiang_id;
			toupiaoxuanxiangDAO.getHibernateTemplate().bulkUpdate(sql);
		}
		
		request.setAttribute("msg", "非常感谢您的参与");
		return "msg";
	}
	
	
	public String wenjuan_jieguo()
	{
		TWenjuan wenjuan=wenjuanDAO.findById(id);
		
		String sql="from TToupiao where wenjuan_id="+wenjuan.getId();
		List toupiaoList=toupiaoDAO.getHibernateTemplate().find(sql);
		for(int i=0;i<toupiaoList.size();i++)
		{
			TToupiao toupiao=(TToupiao)toupiaoList.get(i);
			String sql11="from TToupiaoxuanxiang where toupiao_id="+toupiao.getId();
			List xuanxiangList=toupiaoxuanxiangDAO.getHibernateTemplate().find(sql11);
			toupiao.setXuanxiangList(xuanxiangList);
		}
		
		wenjuan.setToupiaoList(toupiaoList);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("wenjuan", wenjuan);
		return ActionSupport.SUCCESS;
	}
	
	

	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getMingcheng()
	{
		return mingcheng;
	}
	public void setMingcheng(String mingcheng)
	{
		this.mingcheng = mingcheng;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public TWenjuanDAO getWenjuanDAO()
	{
		return wenjuanDAO;
	}
	public void setWenjuanDAO(TWenjuanDAO wenjuanDAO)
	{
		this.wenjuanDAO = wenjuanDAO;
	}


	public TToupiaoDAO getToupiaoDAO()
	{
		return toupiaoDAO;
	}


	public void setToupiaoDAO(TToupiaoDAO toupiaoDAO)
	{
		this.toupiaoDAO = toupiaoDAO;
	}


	public TToupiaoxuanxiangDAO getToupiaoxuanxiangDAO()
	{
		return toupiaoxuanxiangDAO;
	}


	public void setToupiaoxuanxiangDAO(TToupiaoxuanxiangDAO toupiaoxuanxiangDAO)
	{
		this.toupiaoxuanxiangDAO = toupiaoxuanxiangDAO;
	}
	
}
