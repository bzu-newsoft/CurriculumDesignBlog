package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Message;

public interface BackgroundMessagesServer {
	public String BackgroundMessagesServerInsert(Message message);
	public String BackgroundMessagesServerDelect(Message message);
	public String BackgroundMessagesServerUpdata(Message message);
	public List<Message> BackgroundMessagesServer();
}
