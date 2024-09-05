package com.nani.www.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


	@Table
	@Entity
	public class BankAccountTransaction 
	{
	@Id
	private long id;
	@Column
	private String TransactionType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String TransactionType) {
		this.TransactionType = TransactionType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	@Column
	private String transactionId;
	@Column
	private BigDecimal amount;
	
	@ManyToOne
	private BankAccount destinationBankAccount ;
	public BankAccount getDestinationBankAccount() {
		return destinationBankAccount;
	}
	public void setDestinationBankAccount(BankAccount destinationBankAccount) {
		this.destinationBankAccount = destinationBankAccount;
	}
	@Column
	private String transactionTime;
	@Column
	private String narration;
	@ManyToOne
    private Bank bank;
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@OneToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	private BankAccount bankAccount;
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	} 
    
}
