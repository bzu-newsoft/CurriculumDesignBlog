package com.bzu.histoire.blog.server.impl;

import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundMemberImpl;
import com.bzu.histoire.blog.server.BackgroundMemberServer;
import com.bzu.histoire.blog.pojo.Member;

public class BackgroundMemberServerImpl implements BackgroundMemberServer {

	BackgroundMemberImpl bai;
	List<Member> acrticlelist;
	String strreturn;

	@Override
	public List<Member> BackgroundMemberServer() {
		// TODO Auto-generated method stub
		bai = new BackgroundMemberImpl();
		acrticlelist = bai.SelectAllMember();
		return acrticlelist;
	}

	@Override
	public String BackgroundMemberServerInsert(Member member) {
		// TODO Auto-generated method stub
		bai = new BackgroundMemberImpl();
		strreturn = bai.InsertMember(member);
		return strreturn;
	}

	@Override
	public String BackgroundMemberServerDelect(Member member) {
		// TODO Auto-generated method stub
		bai = new BackgroundMemberImpl();
		strreturn = bai.DeleteMember(member);
		return strreturn;
	}

	@Override
	public String BackgroundMemberServerUpdata(Member member) {
		// TODO Auto-generated method stub
		bai = new BackgroundMemberImpl();
		strreturn = bai.UpdateMember(member);
		return strreturn;
	}

}
