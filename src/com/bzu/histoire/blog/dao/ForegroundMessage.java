package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Message;

public interface ForegroundMessage {
	
	public String InsertMessage(Message message);
	
	public String DeleteMessage(Message message);
	
	public String UpdateMessage(Message message);
	
	public Message SelectOneMessage(Message message);
	
	public List<Message> SelectAllMessage();
	
}
