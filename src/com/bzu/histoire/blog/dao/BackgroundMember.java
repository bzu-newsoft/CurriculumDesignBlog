package com.bzu.histoire.blog.dao;

import java.util.List;

import com.bzu.histoire.blog.pojo.Member;

public interface BackgroundMember {
	
	public String InsertMember(Member member);
	
	public String DeleteMember(Member member);
	
	public String UpdateMember(Member member);
	
	public Member SelectOneMember(Member member);
	
	public List<Member> SelectAllMember();
	
}
