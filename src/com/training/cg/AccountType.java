package com.training.cg;

public class AccountType implements Account {
	
	double initialBalance;
	double totalBalance;
	double rateOfInterest;
	String accountHolder;
	String accountId;

	@Override
	public void deposit(double amount) {
		totalBalance = totalBalance+amount;
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= totalBalance) {
			totalBalance = totalBalance-amount;
		}
		else {
			System.out.println("insufficient Balance");
		}
	}

	@Override
	public double checkBalance() {
		return totalBalance;
	}

	@Override
	public double getInterest(int timePeriod,double rateOfInterest) {
		double SI=((initialBalance*rateOfInterest*timePeriod)/100);
		return SI;
	}
	

}
