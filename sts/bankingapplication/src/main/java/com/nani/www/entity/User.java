package com.nani.www.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Table
	@Entity
	public class User 
	{
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	
	@Column
	private long roles;
	@Column
	private String gender;
	@Column
	private String street;
	@Column
	private String city;
	
	@Column
	private int pincode;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getRoles() {
		return roles;
	}

	public void setRoles(long roles) {
		this.roles = roles;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	private long contact;



	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
     public String getIsAccountLinked() {
		return isAccountLinked;
	}

	public void setIsAccountLinked(String isAccountLinked) {
		this.isAccountLinked = isAccountLinked;
	}

	private String isAccountLinked;
     
	

	
	}

	

}
