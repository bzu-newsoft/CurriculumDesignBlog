package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Images;
import com.bzu.histoire.blog.pojo.Member;

public interface BackgroundImagesServer {
	public String BackgroundImagesServerInsert(Images images);
	public String BackgroundImagesServerDelect(Images images);
	public String BackgroundImagesServerupdata(Images images);
	public List<Images> BackgroundImagesServer();
}
