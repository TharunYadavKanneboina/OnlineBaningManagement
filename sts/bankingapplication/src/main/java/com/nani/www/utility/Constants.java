package com.nani.www.utility;

public class Constants {
    public enum UserRole{
    	ROLE_CUSTOMER("Customer"),
    	ROLE_ADMIN("Admin"),
    	ROLE_BANK("BANK");
    	private String role;
    	private UserRole(String role) {
    		this.role=role;
         }
    	public String value() {
    		return this.role;
    	}
    }
    
    public enum UserStatus{
    	ActiVATED("activate"),
    	DEACTIVED("deactives");
    	private String status;
    	private UserStatus(String Status) {
    		this.status=status;
    	}
    	public String value() {
    		return this.status;
    	}
    	
    	
    }
    
      public enum IsAccountLinked{
    	  YES("yess"),
    	  NO("noo");
    	  private String status;
      	private  IsAccountLinked(String Status) {
      		this.status=status;
      	}
      	public String value() {
      		return this.status;
      	}  
      }
      public enum BankAccountStatus{
    	  OPEN("yess"),
    	     DELECTED("deleted"),
    	  LOCK("lock");
    	  
    	  private String status;
      	private  BankAccountStatus(String Status) {
      		this.status=status;
      	}
      	public String value() {
      		return this.status;
      	}  
      }
      public enum BankAccountType{
    	  SAVINGS("savings"),
    	   CURRENT("current");
         private String type;
      	private BankAccountType(String type) {
      		this.type=type;
      	}
      	public String value() {
      		return this.type;
      	}  
      }
     public enum TransactionType{
    	  WITHDRAW("withdraw"),
    	  DEPOSITE("deposite"),
    	  BALANCE_FETCH("balance fetch"),
    	  ACCOUNT_TRANSFER("account type");
         private String type;
      	private TransactionType(String type) {
      		this.type=type;
      	}
      	public String value() {
      		return this.type;
      	}  
  }
     public enum TransactionNarrow{
   	  BANK_WITHDRAW("bank_withdraw"),
   	  BANK_DEPOSITE("bank_deposite");
   	 
        private String type;
     	private TransactionNarrow(String type) {
     		this.type=type;
     	}
     	public String value() {
     		return this.type;
     	}
     }
}
