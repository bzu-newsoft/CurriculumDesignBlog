package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bzu.histoire.blog.dao.ForegroundAcrticleType;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Acrticletype;

public class ForegroundAcrticleTypeImpl implements ForegroundAcrticleType {

	@Override
	public String InsertAcrticleType(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public String DeleteAcrticleType(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public String UpdateAcrticleType(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		return "fail";
	}

	@Override
	public Acrticletype SelectOneAcrticleType(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticletype ");
		List<Acrticletype> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list.get(0);
	}

	@Override
	public List<Acrticletype> SelectAllAcrticleType() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Acrticletype ");
		List<Acrticletype> list = query.list(); // ����ͬ��
		HibernateSessionFactory.closeSession();
		return list;
	}

	

}
