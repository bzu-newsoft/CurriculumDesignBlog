package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Images;

public interface BackgroundImages {
	
	public String InsertImages(Images images);
	
	public String DeleteImages(Images images);
	
	public String UpdateImages(Images images);
	
	public Images SelectOneImages(Images images);
	
	public List<Images> SelectAllImages();
	
}
