package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bzu.histoire.blog.dao.BackgroundMessage;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Message;

public class BackgroundMessageImpl implements BackgroundMessage {

	@Override
	public String InsertMessage(Message message) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(message);
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
	public String DeleteMessage(Message message) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.delete(message);
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
	public String UpdateMessage(Message message) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();

		try {
			session.update(message);
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
	public Message SelectOneMessage(Message message) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Message ");
		List<Message> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Message> SelectAllMessage() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Message ");
		List<Message> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list;
	}

	

}
