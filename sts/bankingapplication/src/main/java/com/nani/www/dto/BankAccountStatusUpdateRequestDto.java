package com.nani.www.dto;

public class BankAccountStatusUpdateRequestDto extends CommonApiResponse {

	private long accountId;
	private  String status;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
