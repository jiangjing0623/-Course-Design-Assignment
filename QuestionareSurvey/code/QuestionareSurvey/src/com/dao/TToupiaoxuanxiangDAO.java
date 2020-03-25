package com.dao;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TToupiaoxuanxiang;

/**
 * Data access object (DAO) for domain model class TToupiaoxuanxiang.
 * 
 * @see com.model.TToupiaoxuanxiang
 * @author MyEclipse Persistence Tools
 */

public class TToupiaoxuanxiangDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory
			.getLog(TToupiaoxuanxiangDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TToupiaoxuanxiang transientInstance)
	{
		log.debug("saving TToupiaoxuanxiang instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TToupiaoxuanxiang persistentInstance)
	{
		log.debug("deleting TToupiaoxuanxiang instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TToupiaoxuanxiang findById(java.lang.String id)
	{
		log.debug("getting TToupiaoxuanxiang instance with id: " + id);
		try
		{
			TToupiaoxuanxiang instance = (TToupiaoxuanxiang) getHibernateTemplate()
					.get("com.model.TToupiaoxuanxiang", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TToupiaoxuanxiang instance)
	{
		log.debug("finding TToupiaoxuanxiang instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TToupiaoxuanxiang instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TToupiaoxuanxiang as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll()
	{
		log.debug("finding all TToupiaoxuanxiang instances");
		try
		{
			String queryString = "from TToupiaoxuanxiang";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TToupiaoxuanxiang merge(TToupiaoxuanxiang detachedInstance)
	{
		log.debug("merging TToupiaoxuanxiang instance");
		try
		{
			TToupiaoxuanxiang result = (TToupiaoxuanxiang) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TToupiaoxuanxiang instance)
	{
		log.debug("attaching dirty TToupiaoxuanxiang instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TToupiaoxuanxiang instance)
	{
		log.debug("attaching clean TToupiaoxuanxiang instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TToupiaoxuanxiangDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TToupiaoxuanxiangDAO) ctx.getBean("TToupiaoxuanxiangDAO");
	}
}