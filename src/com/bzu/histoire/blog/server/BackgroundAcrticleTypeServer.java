package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Acrticletype;

public interface BackgroundAcrticleTypeServer {
	public String BackgroundAcrticleTypeServerInsert(Acrticletype acrticletype);
	public String BackgroundAcrticleTypeServerDelect(Acrticletype acrticletype);
	public String BackgroundAcrticleTypeServerUpdata(Acrticletype acrticletype);
	public List<Acrticletype> BackgroundActricleTypeServer();
}
