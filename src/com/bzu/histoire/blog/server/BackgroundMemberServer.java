package com.bzu.histoire.blog.server;

import java.util.List;

import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Member;

public interface BackgroundMemberServer {
	public String BackgroundMemberServerInsert(Member member);
	public String BackgroundMemberServerDelect(Member member);
	public String BackgroundMemberServerUpdata(Member member);
	public List<Member> BackgroundMemberServer();
}
