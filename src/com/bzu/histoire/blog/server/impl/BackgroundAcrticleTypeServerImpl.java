package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundAcrticleTypeImpl;
import com.bzu.histoire.blog.server.BackgroundAcrticleTypeServer;
import com.bzu.histoire.blog.pojo.Acrticletype;


public class BackgroundAcrticleTypeServerImpl implements BackgroundAcrticleTypeServer{

	BackgroundAcrticleTypeImpl bai;
	List<Acrticletype> acrticlelist;
	Acrticletype acrticletype;
	String strreturn;
	
	@Override
	public List<Acrticletype> BackgroundActricleTypeServer() {
		// TODO Auto-generated method stub
		bai = new BackgroundAcrticleTypeImpl();
		acrticlelist = bai.SelectAllAcrticleType();
		return acrticlelist;
	}

	@Override
	public String BackgroundAcrticleTypeServerInsert(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		bai = new BackgroundAcrticleTypeImpl();
		strreturn = bai.InsertAcrticleType(acrticletype);
		return strreturn;
	}

	@Override
	public String BackgroundAcrticleTypeServerDelect(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		bai = new BackgroundAcrticleTypeImpl();
		strreturn = bai.DeleteAcrticleType(acrticletype);
		return strreturn;
	}

	@Override
	public String BackgroundAcrticleTypeServerUpdata(Acrticletype acrticletype) {
		// TODO Auto-generated method stub
		bai = new BackgroundAcrticleTypeImpl();
		strreturn = bai.UpdateAcrticleType(acrticletype);
		return strreturn;
	}
	
}
