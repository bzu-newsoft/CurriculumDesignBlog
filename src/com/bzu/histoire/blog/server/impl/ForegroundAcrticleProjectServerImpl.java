package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.ForegroundAcrticleImpl;
import com.bzu.histoire.blog.server.*;
import com.bzu.histoire.blog.pojo.Acrticle;

public class ForegroundAcrticleProjectServerImpl implements ForegroundAcrticleProjectServer {

	ForegroundAcrticleImpl ACRTICLE_IMPL;
	List<Acrticle> acrticlelist;
	
	@Override
	public List<Acrticle> ForegroundAcrticleProjectServer() {
		// TODO Auto-generated method stub
		ACRTICLE_IMPL = new ForegroundAcrticleImpl();
		acrticlelist = ACRTICLE_IMPL.SelectAllAcrticle();
		return acrticlelist;
	}

}
