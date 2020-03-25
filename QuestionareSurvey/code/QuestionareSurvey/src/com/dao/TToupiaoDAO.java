package com.dao;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TToupiao;

/**
 * Data access object (DAO) for domain model class TToupiao.
 * 
 * @see com.model.TToupiao
 * @author MyEclipse Persistence Tools
 */

public class TToupiaoDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TToupiaoDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TToupiao transientInstance)
	{
		log.debug("saving TToupiao instance");
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

	public void delete(TToupiao persistentInstance)
	{
		log.debug("deleting TToupiao instance");
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

	public TToupiao findById(java.lang.String id)
	{
		log.debug("getting TToupiao instance with id: " + id);
		try
		{
			TToupiao instance = (TToupiao) getHibernateTemplate().get(
					"com.model.TToupiao", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TToupiao instance)
	{
		log.debug("finding TToupiao instance by example");
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
		log.debug("finding TToupiao instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TToupiao as model where model."
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
		log.debug("finding all TToupiao instances");
		try
		{
			String queryString = "from TToupiao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TToupiao merge(TToupiao detachedInstance)
	{
		log.debug("merging TToupiao instance");
		try
		{
			TToupiao result = (TToupiao) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TToupiao instance)
	{
		log.debug("attaching dirty TToupiao instance");
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

	public void attachClean(TToupiao instance)
	{
		log.debug("attaching clean TToupiao instance");
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

	public static TToupiaoDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TToupiaoDAO) ctx.getBean("TToupiaoDAO");
	}
}