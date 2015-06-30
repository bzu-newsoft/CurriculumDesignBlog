package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Recycle;

public interface BackgroundAcrticleRecycle {
	public String BackgroundAcrticleRecycleInsert(Recycle recycle);
	public String BackgroundAcrticleRecycleDelect(Recycle recycle);
	public String BackgroundAcrticleRecycleUpdata(Recycle recycle);
	public List<Recycle> BackgroundActricleRecycle();
}
