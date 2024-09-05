package com.nani.www.dto;

import java.util.ArrayList;
import java.util.List;

import com.nani.www.entity.Bank;

public class BankDetailsResponseDto extends CommonApiResponse{

List<Bank> banks = new ArrayList<>();

public void setBanks(List<Bank> banks) {
	this.banks = banks;
}

	

}
