package com.nani.www.resource;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.nani.www.dto.BankDetailsResponseDto;
import com.nani.www.dto.CommonApiResponse;
import com.nani.www.dto.RegisterBankRequestDto;
import com.nani.www.entity.Bank;
import com.nani.www.entity.BankAccount;
import com.nani.www.entity.User;
import com.nani.www.service.BankService;
import com.nani.www.service.UserService;
import com.nani.www.utility.Constants.BankAccountStatus;
import com.nani.www.utility.Constants.IsAccountLinked;

@Component
public class BankResource {
private final Logger LOG = LoggerFactory.getLogger(BankResource.class);
	

	
	@Autowired
	private BankService bankService;
	
	@Autowired
	private UserService userService;
	
	public ResponseEntity<CommonApiResponse> registerBankAccount(RegisterBankRequestDto request) {

		LOG.info("Received request for register bank account");

		CommonApiResponse response = new CommonApiResponse();

		if (request == null) {
         	response.setResponseMessage("bad request, missing data");
			response.setIsSuccess(true);

			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(request.getUserId() == 0) {
			response.setResponseMessage("bad request, user id is null");
			response.setIsSuccess(true);

			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.BAD_REQUEST);
		}
	
		
     Bank account = RegisterBankRequestDto.toBankEntity(request);
        
        User user = this.userService.getUserById(request.getUserId());
        account.setUser(user);
        
        Bank bank = this.bankService.getBankById(request.getId());
        account.setBank(bank);
        
        account.setStatus(BankAccountStatus.OPEN.value());
        account.setCreationDate(String.valueOf(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
        account.setBalance(BigDecimal.ZERO);
        
        Bank addedBankAccount = this.bankService.addBank(account);
        
        
        if(addedBankAccount != null) {
        	
        	user.setIsAccountLinked(IsAccountLinked.YES.value());
        	this.userService.updateUser(user);
        	
			response.setResponseMessage("Bank Account Created Successfully!!!");
			response.setIsSuccess(true);
 
			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.OK);    	 
        } else {
			response.setResponseMessage("Failed to add the bank account");
			response.setIsSuccess(true);

			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.BAD_REQUEST);
        }

	}
	
        
        
	
	public ResponseEntity<BankDetailsResponseDto> fetchAllBank() { 
		
		LOG.info("Received request for fetching all by bank");

		BankDetailsResponseDto response = new 	BankDetailsResponseDto();
		
		List<Bank> register = new ArrayList<>();
		
		register = this.bankService.getAllBank();
		
		response.setBanks(register);
		response.setResponseMessage("Bank Accounts Fetch Successfully!!!");
		response.setIsSuccess(true);

		return new ResponseEntity<BankDetailsResponseDto>(response, HttpStatus.OK);    	 
   
	}
	
    public ResponseEntity<BankDetailsResponseDto> fetchBankById(long bankId) { 
		
		LOG.info("Received request for fetching all the bank accounts from bank side");

		BankDetailsResponseDto response = new BankDetailsResponseDto();
		
		List<Bank> register = new ArrayList<>();
		
		if(bankId == 0) {
			response.setResponseMessage("  not registered , bank id is missing");
			response.setIsSuccess(true);

			return new ResponseEntity<BankDetailsResponseDto>(response, HttpStatus.BAD_REQUEST);	
		}
		
		register = this.bankService.getByBank(bankId);
		
		response.setBanks(register);
		response.setResponseMessage("Bank registered Successfully!!!");
		response.setIsSuccess(true);

		return new ResponseEntity<BankDetailsResponseDto>(response, HttpStatus.OK);    	 
   
	}
    
    public ResponseEntity<BankDetailsResponseDto> fetchBankByUserId(long userId) { 
		
		LOG.info("Received request for fetching bank by using user Id");

		BankDetailsResponseDto response = new BankDetailsResponseDto();
		
		List<Bank> register = new ArrayList<>();
		
		if(userId == 0) {
			response.setResponseMessage("no user found, user id is missing");
			response.setIsSuccess(true);

			return new ResponseEntity<BankDetailsResponseDto>(response, HttpStatus.BAD_REQUEST);	
		}
          register = this.bankService.getByBank(userId);
		
		response.setBanks(register);
		response.setResponseMessage("Bank registered Successfully!!!");
		response.setIsSuccess(true);

		return new ResponseEntity<BankDetailsResponseDto>(response, HttpStatus.OK); 
    }
   
    
}
       
    
    