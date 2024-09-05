package com.nani.www.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.nani.www.dto.CommonApiResponse;
import com.nani.www.dto.RegisterUserRequestDto;
import com.nani.www.entity.User;
import com.nani.www.service.UserService;

@Component
public class UserResource {
private final Logger LOG = LoggerFactory.getLogger(UserResource.class);
	
	
	
	
	@Autowired
	private UserService userService;
	
	public ResponseEntity<CommonApiResponse> registerBankAccount(RegisterUserRequestDto request) {

		LOG.info("Received request for register bank account");

		CommonApiResponse response = new CommonApiResponse();

		if (request == null) {
         	response.setResponseMessage("bad request, missing data");
			response.setIsSuccess(true);

			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(request.getId() == 0) {
			response.setResponseMessage("user Not Found, user id is null");
			response.setIsSuccess(true);

			return new ResponseEntity<CommonApiResponse>(response, HttpStatus.BAD_REQUEST);
		}
		

	
}