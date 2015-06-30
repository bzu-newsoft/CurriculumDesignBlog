package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundAcrticleImpl;
import com.bzu.histoire.blog.server.BackgroundAcrticlePublish;
import com.bzu.histoire.blog.pojo.Acrticle;

public class BackgroundAcrticlePublishImpl implements BackgroundAcrticlePublish{

	BackgroundAcrticleImpl bai;
	String strreturn;
	List<Acrticle> acrticlelist;
	
	public String BackgroundAcrticlePublishInsert(Acrticle acrticle){
		bai = new BackgroundAcrticleImpl();
		strreturn=bai.InsertAcrticle(acrticle);
		return strreturn;
	}
	
	public String BackgroundAcrticlePublishDelect(Acrticle acrticle){
		bai = new BackgroundAcrticleImpl();
		strreturn=bai.DeleteAcrticle(acrticle);
		return strreturn;
	}
	
	public String BackgroundAcrticlePublishUpdata(Acrticle acrticle){
		bai = new BackgroundAcrticleImpl();
		strreturn=bai.UpdateAcrticle(acrticle);
		return strreturn;
	}
	
	@Override
	public List<Acrticle> BackgroundActriclePublish() {
		// TODO Auto-generated method stub
		bai = new BackgroundAcrticleImpl();
		acrticlelist = bai.SelectAllAcrticle();
		return acrticlelist;
	}
	
}
