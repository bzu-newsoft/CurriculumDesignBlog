package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundRecycleImpl;
import com.bzu.histoire.blog.server.BackgroundAcrticleRecycle;
import com.bzu.histoire.blog.pojo.Recycle;

public class BackgroundAcrticleRecycleImpl implements BackgroundAcrticleRecycle{

	BackgroundRecycleImpl bai;
	String strreturn;
	List<Recycle> acrticlelist;
	
	@Override
	public List<Recycle> BackgroundActricleRecycle() {
		// TODO Auto-generated method stub
		bai = new BackgroundRecycleImpl();
		acrticlelist = bai.SelectAllRecycle();
		return acrticlelist;
	}

	@Override
	public String BackgroundAcrticleRecycleInsert(Recycle recycle) {
		// TODO Auto-generated method stub
		bai = new BackgroundRecycleImpl();
		strreturn = bai.InsertRecycle(recycle);
		return strreturn;
	}

	@Override
	public String BackgroundAcrticleRecycleDelect(Recycle recycle) {
		// TODO Auto-generated method stub
		bai = new BackgroundRecycleImpl();
		strreturn = bai.DeleteRecycle(recycle);
		return strreturn;
	}

	@Override
	public String BackgroundAcrticleRecycleUpdata(Recycle recycle) {
		// TODO Auto-generated method stub
		bai = new BackgroundRecycleImpl();
		strreturn = bai.UpdateRecycle(recycle);
		return strreturn;
	}
	
}
