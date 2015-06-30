package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bzu.histoire.blog.dao.BackgroundAcrticle;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Acrticle;

public class BackgroundAcrticleImpl implements BackgroundAcrticle {

	@Override
	@SuppressWarnings("deprecation")
	public String InsertAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub

		System.out.println("InsertAcrticle");
		
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
	public String DeleteAcrticle(Acrticle acrticle) {
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
	public String UpdateAcrticle(Acrticle acrticle) {
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
	public Acrticle SelectOneAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticle ");
		List<Acrticle> list = query.list(); 
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Acrticle> SelectAllAcrticle() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticle");
		List<Acrticle> list = query.list(); 
		HibernateSessionFactory.closeSession();
		return list;
	}

}
