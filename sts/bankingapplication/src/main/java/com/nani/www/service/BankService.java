package com.nani.www.service;

import java.util.List;

import com.nani.www.entity.Bank;

public interface BankService {
	
	Bank getBankById(long userid);
	Bank addBank(Bank bank);
	Bank updateBank(Bank bank);
	List<Bank> getAllBank();
	List<Bank> getByBank(long bankId);

}