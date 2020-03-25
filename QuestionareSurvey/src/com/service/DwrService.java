package com.service;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;

import com.dao.TToupiaoDAO;
import com.dao.TToupiaoxuanxiangDAO;
import com.dao.TWenjuanDAO;
import com.model.TToupiao;
import com.model.TWenjuan;


public class DwrService
{
	private TWenjuanDAO wenjuanDAO;
	private TToupiaoDAO toupiaoDAO;
	private TToupiaoxuanxiangDAO toupiaoxuanxiangDAO;
	
	public String getForwardHTMLPage(String id) throws ServletException, IOException
	{
		
		WebContext wctx = WebContextFactory.get();
		wctx.getHttpServletRequest().setCharacterEncoding("UTF-8");
	    wctx.getHttpServletResponse().setCharacterEncoding("UTF-8");
	    wctx.getHttpServletResponse().setContentType("text/html;charset=UTF-8");
	    
	    
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
		
		wctx.getHttpServletRequest().setAttribute("wenjuan", wenjuan);
	    return wctx.forwardToString("/admin/wenjuan/wenjuanYulan1.jsp");
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

	public TWenjuanDAO getWenjuanDAO()
	{
		return wenjuanDAO;
	}

	public void setWenjuanDAO(TWenjuanDAO wenjuanDAO)
	{
		this.wenjuanDAO = wenjuanDAO;
	}
	
	
}
