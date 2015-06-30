package com.bzu.histoire.blog.server.impl;

import com.bzu.histoire.blog.server.BackgroundMemberLogin;

public class BackgroundMemberLoginImpl implements BackgroundMemberLogin {

	@Override
	public String BackGroundMemberLogin(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("admin") && password.equals("admin")){
			System.out.println("success");
			return "success";
		}else{
			System.out.println("fail");
			return "fail";
		}
	}

}
