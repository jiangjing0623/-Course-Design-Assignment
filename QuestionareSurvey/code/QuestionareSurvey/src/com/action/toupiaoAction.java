package com.action;


import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TToupiaoDAO;
import com.dao.TToupiaoxuanxiangDAO;
import com.model.TToupiao;
import com.model.TToupiaoxuanxiang;
import com.opensymphony.xwork2.ActionSupport;

public class toupiaoAction extends ActionSupport
{
		
	private TToupiaoDAO toupiaoDAO;
	private TToupiaoxuanxiangDAO toupiaoxuanxiangDAO;
	
	public String toupiaoAdd()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String id=String.valueOf(new Date().getTime());
		String title=request.getParameter("title");
		String wenjuan_id=request.getParameter("wenjuan_id");
		TToupiao toupiao=new TToupiao();
		
		toupiao.setId(id);
		toupiao.setTitle(title);
		toupiao.setWenjuan_id(wenjuan_id);
		
		toupiaoDAO.save(toupiao);
		
		String[] xuanxiangneirong=request.getParameterValues("xuanxiangneirong");
		for(int i=0;i<xuanxiangneirong.length;i++)
		{
			try
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(xuanxiangneirong[i]+"%%");
			toupiaoxuanxiangSave(xuanxiangneirong[i], id);//这个地方的id是投票的id
		}
		
		request.setAttribute("msg", "添加完毕");
		return "msg";
	}
	
	
	public void toupiaoxuanxiangSave(String xuanxiangneirong,String toupiao_id)
	{
		TToupiaoxuanxiang toupiaoxuanxiang=new TToupiaoxuanxiang();
		
		toupiaoxuanxiang.setId(String.valueOf(new Date().getTime()));
		toupiaoxuanxiang.setXuanxiangneirong(xuanxiangneirong);
		toupiaoxuanxiang.setPiaoshu(0);
		toupiaoxuanxiang.setToupiao_id(toupiao_id);
		
		toupiaoxuanxiangDAO.save(toupiaoxuanxiang);
	}
	
	
	public String toupiao_zhutu()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String toupiao_id=request.getParameter("toupiao_id");
		
		String sql="from TToupiaoxuanxiang where toupiao_id=?";
		Object[] c={toupiao_id};
		List xuanxiangList=toupiaoxuanxiangDAO.getHibernateTemplate().find(sql,c);
		
		
		request.setAttribute("xuanxiangList", xuanxiangList);
		return ActionSupport.SUCCESS;
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
