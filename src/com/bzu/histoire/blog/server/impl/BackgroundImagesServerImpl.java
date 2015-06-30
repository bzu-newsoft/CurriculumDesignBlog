package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundImagesImpl;
import com.bzu.histoire.blog.server.BackgroundImagesServer;
import com.bzu.histoire.blog.pojo.Images;

public class BackgroundImagesServerImpl implements BackgroundImagesServer{

	BackgroundImagesImpl bai;
	List<Images> acrticlelist;
	String strreturn;
	
	@Override
	public List<Images> BackgroundImagesServer() {
		// TODO Auto-generated method stub
		bai = new BackgroundImagesImpl();
		acrticlelist = bai.SelectAllImages();
		return acrticlelist;
	}

	@Override
	public String BackgroundImagesServerInsert(Images images) {
		// TODO Auto-generated method stub
		bai = new BackgroundImagesImpl();
		strreturn = bai.InsertImages(images);
		return strreturn;
	}

	@Override
	public String BackgroundImagesServerDelect(Images images) {
		// TODO Auto-generated method stub
		bai = new BackgroundImagesImpl();
		strreturn = bai.DeleteImages(images);
		return strreturn;
	}

	@Override
	public String BackgroundImagesServerupdata(Images images) {
		// TODO Auto-generated method stub
		bai = new BackgroundImagesImpl();
		strreturn = bai.UpdateImages(images);
		return strreturn;
	}
	
}
