package com.nani.www.dto;

public class UserStatusUpdateRequestDto extends CommonApiResponse{
	private int userId;
	private String status;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}