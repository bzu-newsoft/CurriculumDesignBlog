package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;

public interface ForegroundAcrticle {
	
	public String InsertAcrticle(Acrticle acrticle);
	
	public String DeleteAcrticle(Acrticle acrticle);
	
	public String UpdateAcrticle(Acrticle acrticle);
	
	public Acrticle SelectOneAcrticle(Acrticle acrticle);
	
	public List<Acrticle> SelectAllAcrticle();
	
}
