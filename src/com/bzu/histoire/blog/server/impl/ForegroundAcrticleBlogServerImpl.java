package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.ForegroundAcrticleImpl;
import com.bzu.histoire.blog.server.ForegroundAcrticleBlogServer;
import com.bzu.histoire.blog.pojo.Acrticle;

public class ForegroundAcrticleBlogServerImpl implements ForegroundAcrticleBlogServer {

	ForegroundAcrticleImpl ACRTICLE_IMPL;
	List<Acrticle> acrticlelist;
	
	@Override
	public List<Acrticle> ForegroundAcrticleBlogServer() {
		// TODO Auto-generated method stub
		ACRTICLE_IMPL = new ForegroundAcrticleImpl();
		acrticlelist = ACRTICLE_IMPL.SelectAllAcrticle();
		return acrticlelist;
	}

}
