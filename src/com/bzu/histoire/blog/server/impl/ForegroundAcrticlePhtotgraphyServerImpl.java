package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.ForegroundImagesImpl;
import com.bzu.histoire.blog.server.ForegroundAcrticlePhotographyServer;
import com.bzu.histoire.blog.pojo.Images;

public class ForegroundAcrticlePhtotgraphyServerImpl implements ForegroundAcrticlePhotographyServer {

	ForegroundImagesImpl ACRTICLE_IMPL;
	List<Images> acrticlelist;
	
	@Override
	public List<Images> ForegroundAcrticlePhotographyServer() {
		// TODO Auto-generated method stub
		ACRTICLE_IMPL = new ForegroundImagesImpl();
		acrticlelist = ACRTICLE_IMPL.SelectAllImages();
		return acrticlelist;
	}

}
