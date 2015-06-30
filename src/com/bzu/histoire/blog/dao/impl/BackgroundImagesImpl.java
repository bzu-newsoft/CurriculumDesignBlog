package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bzu.histoire.blog.dao.BackgroundImages;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Images;

public class BackgroundImagesImpl implements BackgroundImages {

	@Override
	public String InsertImages(Images images) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(images);
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
	public String DeleteImages(Images images) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.delete(images);
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
	public String UpdateImages(Images images) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();

		try {
			session.update(images);
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
	public Images SelectOneImages(Images images) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Images ");
		List<Images> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Images> SelectAllImages() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Images ");
		List<Images> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list;
	}

	
}
