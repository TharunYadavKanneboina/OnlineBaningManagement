package com.nani.www.dto;

import org.springframework.beans.BeanUtils;

import com.nani.www.entity.BankAccount;

public class AddBankAccountRequestDto extends CommonApiResponse {
	private int number;
	private String ifscCode;
	private String type;
	private long bankId;
	private int userId;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public static BankAccount toBankAccountEntity(AddBankAccountRequestDto addBankAccountRequestDto) {
		BankAccount bankAccount =new BankAccount();
		BeanUtils.copyProperties(addBankAccountRequestDto, bankAccount, "bankId", "userId");		
		return bankAccount;
	}
	

}
