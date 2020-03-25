package com.dao;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TWenjuan;

/**
 * Data access object (DAO) for domain model class TWenjuan.
 * 
 * @see com.model.TWenjuan
 * @author MyEclipse Persistence Tools
 */

public class TWenjuanDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TWenjuanDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TWenjuan transientInstance)
	{
		log.debug("saving TWenjuan instance");
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

	public void delete(TWenjuan persistentInstance)
	{
		log.debug("deleting TWenjuan instance");
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

	public TWenjuan findById(java.lang.String id)
	{
		log.debug("getting TWenjuan instance with id: " + id);
		try
		{
			TWenjuan instance = (TWenjuan) getHibernateTemplate().get(
					"com.model.TWenjuan", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TWenjuan instance)
	{
		log.debug("finding TWenjuan instance by example");
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
		log.debug("finding TWenjuan instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TWenjuan as model where model."
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
		log.debug("finding all TWenjuan instances");
		try
		{
			String queryString = "from TWenjuan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TWenjuan merge(TWenjuan detachedInstance)
	{
		log.debug("merging TWenjuan instance");
		try
		{
			TWenjuan result = (TWenjuan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TWenjuan instance)
	{
		log.debug("attaching dirty TWenjuan instance");
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

	public void attachClean(TWenjuan instance)
	{
		log.debug("attaching clean TWenjuan instance");
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

	public static TWenjuanDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TWenjuanDAO) ctx.getBean("TWenjuanDAO");
	}
}