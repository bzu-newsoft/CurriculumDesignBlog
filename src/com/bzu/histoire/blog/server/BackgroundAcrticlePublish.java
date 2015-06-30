package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;

public interface BackgroundAcrticlePublish {
	public String BackgroundAcrticlePublishInsert(Acrticle acrticle);
	public String BackgroundAcrticlePublishDelect(Acrticle acrticle);
	public String BackgroundAcrticlePublishUpdata(Acrticle acrticle);
	public List<Acrticle> BackgroundActriclePublish();
}
