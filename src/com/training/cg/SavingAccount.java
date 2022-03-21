package com.training.cg;

public class SavingAccount extends AccountType{
	
	//double initialBalance;
	//double totalBalance;
	//String accountHolder;
	//String accountNumber;
	final double rateOfInterest = 5;
	public SavingAccount(String accountHolder, String accountId, double initialBalance) {
		this.accountHolder = accountHolder;
		this.accountId = accountId;
		this.initialBalance = initialBalance;
		this.totalBalance = initialBalance;	
	}
	public String accountId() {
		return accountId;
	}
	public String accountHolder() {
		return accountHolder ;
	}
}
