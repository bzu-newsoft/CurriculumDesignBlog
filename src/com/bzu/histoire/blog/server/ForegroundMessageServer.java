package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;

public interface ForegroundMessageServer {
	public String InsertMessage(String username, String email, String message);
}
