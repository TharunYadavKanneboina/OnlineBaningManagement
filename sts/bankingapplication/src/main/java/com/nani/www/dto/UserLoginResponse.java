package com.nani.www.dto;

import com.nani.www.entity.User;

public class UserLoginResponse extends CommonApiResponse{
    public void setUser(User user) {
		this.user = user;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	private User user;
	private String jwtToken;
	
	

}
