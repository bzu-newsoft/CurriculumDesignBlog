package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Recycle;

public interface BackgroundRecycle {
	
	public String InsertRecycle(Recycle recycle);
	
	public String DeleteRecycle(Recycle recycle);
	
	public String UpdateRecycle(Recycle recycle);
	
	public Recycle SelectOneRecycle(Recycle recycle);
	
	public List<Recycle> SelectAllRecycle();
	
}
