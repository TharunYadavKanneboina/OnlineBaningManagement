package com.nani.www.dto;

import java.util.ArrayList;
import java.util.List;

import com.nani.www.entity.BankAccount;

public class BankAccountResponseDto extends CommonApiResponse {
	List<BankAccount> accounts=new ArrayList<BankAccount>();

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	
	
	

}
