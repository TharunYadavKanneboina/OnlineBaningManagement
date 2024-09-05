package com.nani.www.dto;

import java.util.ArrayList;
import java.util.List;

import com.nani.www.entity.BankAccountTransaction;

public class BankTransactionResponseDto extends CommonApiResponse{
	List<BankAccountTransaction> bankTransactions = new ArrayList<BankAccountTransaction>();

	public void setBankTransactions(List<BankAccountTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}


}
