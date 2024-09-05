package com.nani.www.dto;

import org.springframework.beans.BeanUtils;

import com.nani.www.entity.Bank;
import com.nani.www.entity.BankAccount;
import com.nani.www.entity.User;

public class RegisterUserRequestDto extends CommonApiResponse{
	private int id;
	private String name;
	private String email;
	private String password;
	private String roles;
	private String gender;
	private long contact;
	private String street;
	private int pincode;
	private long bankId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public static User toUserEntity(RegisterUserRequestDto request) {
		User user=new User();
		BeanUtils.copyProperties(request, user, "id", "bankId");		
		return user;
		
	}
	
}
