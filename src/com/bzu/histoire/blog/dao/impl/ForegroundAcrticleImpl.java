package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bzu.histoire.blog.dao.ForegroundAcrticle;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Acrticle;

public class ForegroundAcrticleImpl implements ForegroundAcrticle {

	@Override
	public String InsertAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public String DeleteAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public String UpdateAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public Acrticle SelectOneAcrticle(Acrticle acrticle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticle ");
		List<Acrticle> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Acrticle> SelectAllAcrticle() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticle ");
		List<Acrticle> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list;
	}

}
