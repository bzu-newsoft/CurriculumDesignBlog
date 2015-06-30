package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bzu.histoire.blog.dao.BackgroundAcrticle;
import com.bzu.histoire.blog.dao.BackgroundRecycle;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Recycle;

public class BackgroundRecycleImpl implements BackgroundRecycle {

	@Override
	@SuppressWarnings("deprecation")
	public String InsertRecycle(Recycle acrticle) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(acrticle);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return "fail";
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
		return "success";
	}

	@Override
	public String DeleteRecycle(Recycle acrticle) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.delete(acrticle);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return "fail";
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
		
//		Session session = HibernateSessionFactory.getSession();
//        Transaction trans = session.beginTransaction();
//        session.delete(acrticle);
//        trans.commit();
//        HibernateSessionFactory.closeSession();

		return "success";
	}

	@Override
	public String UpdateRecycle(Recycle acrticle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();

		try {
			session.update(acrticle);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return "fail";
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return "success";
	}

	@Override
	public Recycle SelectOneRecycle(Recycle acrticle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Recycle ");
		List<Recycle> list = query.list(); 
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Recycle> SelectAllRecycle() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Recycle");
		List<Recycle> list = query.list(); 
		HibernateSessionFactory.closeSession();
		return list;
	}

}
