package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bzu.histoire.blog.dao.ForegroundMessage;
import com.bzu.histoire.blog.pojo.Message;

public class ForegroundMessageImpl implements ForegroundMessage {

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
		return null;
	}

	@Override
	public String UpdateMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message SelectOneMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> SelectAllMessage() {
		// TODO Auto-generated method stub
		return null;
	}



}
