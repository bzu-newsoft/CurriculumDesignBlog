package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundMessageImpl;
import com.bzu.histoire.blog.server.BackgroundMessagesServer;
import com.bzu.histoire.blog.pojo.Message;

public class BackgroundMessagesServerImpl implements BackgroundMessagesServer{

	BackgroundMessageImpl bai;
	List<Message> acrticlelist;
	String strreturn;
	
	@Override
	public List<Message> BackgroundMessagesServer() {
		// TODO Auto-generated method stub
		bai = new BackgroundMessageImpl();
		acrticlelist = bai.SelectAllMessage();
		return acrticlelist;
	}

	@Override
	public String BackgroundMessagesServerInsert(Message message) {
		// TODO Auto-generated method stub
		bai = new BackgroundMessageImpl();
		strreturn = bai.InsertMessage(message);
		return strreturn;
	}

	@Override
	public String BackgroundMessagesServerDelect(Message message) {
		// TODO Auto-generated method stub
		bai = new BackgroundMessageImpl();
		strreturn = bai.DeleteMessage(message);
		return strreturn;
	}

	@Override
	public String BackgroundMessagesServerUpdata(Message message) {
		// TODO Auto-generated method stub
		bai = new BackgroundMessageImpl();
		strreturn = bai.UpdateMessage(message);
		return strreturn;
	}
	
}
