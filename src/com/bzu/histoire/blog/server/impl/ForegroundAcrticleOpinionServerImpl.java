package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.ForegroundAcrticleImpl;
import com.bzu.histoire.blog.server.ForegroundAcrticleOpinionServer;
import com.bzu.histoire.blog.pojo.Acrticle;

public class ForegroundAcrticleOpinionServerImpl implements ForegroundAcrticleOpinionServer {

	ForegroundAcrticleImpl ACRTICLE_IMPL;
	List<Acrticle> acrticlelist;
	
	@Override
	public List<Acrticle> ForegroundAcrticleOpinionServer() {
		// TODO Auto-generated method stub
		ACRTICLE_IMPL = new ForegroundAcrticleImpl();
		acrticlelist = ACRTICLE_IMPL.SelectAllAcrticle();
		return acrticlelist;
	}

}
