package com.nani.www.dto;

import java.util.ArrayList;
import java.util.List;

import com.nani.www.entity.User;

public class UserListResponseDto extends CommonApiResponse {
	List<User> users = new ArrayList<User>();

	public void setUsers(List<User> users) {
		this.users = users;
	}


}
