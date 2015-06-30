package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticletype;

public interface BackgroundAcrticleType {
	
	public String InsertAcrticleType(Acrticletype acrticletype);
	
	public String DeleteAcrticleType(Acrticletype acrticletype);
	
	public String UpdateAcrticleType(Acrticletype acrticletype);
	
	public Acrticletype SelectOneAcrticleType(Acrticletype acrticletype);
	
	public List<Acrticletype> SelectAllAcrticleType();
	
}
