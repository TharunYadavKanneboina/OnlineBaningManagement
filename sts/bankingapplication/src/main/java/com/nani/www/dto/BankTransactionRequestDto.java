package com.nani.www.dto;

public class BankTransactionRequestDto extends CommonApiResponse {
	private int userId;
	private long bankId;
	private double amount;
	private long sourceBankAccountId;
	private String transactionType;
	private String toBankAccount;
	private String toBankIfsc;
	private String accountTransferPurpose;
	public int  getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getSourceBankAccountId() {
		return sourceBankAccountId;
	}
	public void setSourceBankAccountId(long sourceBankAccountId) {
		this.sourceBankAccountId = sourceBankAccountId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getToBankAccount() {
		return toBankAccount;
	}
	public void setToBankAccount(String toBankAccount) {
		this.toBankAccount = toBankAccount;
	}
	public String getToBankIfsc() {
		return toBankIfsc;
	}
	public void setToBankIfsc(String toBankIfsc) {
		this.toBankIfsc = toBankIfsc;
	}
	public String getAccountTransferPurpose() {
		return accountTransferPurpose;
	}
	public void setAccountTransferPurpose(String accountTransferPurpose) {
		this.accountTransferPurpose = accountTransferPurpose;
	}


}
