package com.bzu.histoire.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bzu.histoire.blog.dao.ForegroundImages;
import com.bzu.histoire.blog.hibernate.HibernateSessionFactory;
import com.bzu.histoire.blog.pojo.Images;

public class ForegroundImagesImpl implements ForegroundImages {

	@Override
	public String InsertImages(Images images) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteImages(Images images) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateImages(Images images) {
		// TODO Auto-generated method stub
		return null;
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
