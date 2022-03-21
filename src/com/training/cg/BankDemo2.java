package com.training.cg;

public class BankDemo2 {
	public static void main(String args[])
	{
		SavingAccount sav1 = new SavingAccount("Aisha","AC100",50000);
		
		sav1.deposit(20000);
		sav1.withdraw(10000);
		System.out.println("The Account Holder is :"+ sav1.accountHolder());
		System.out.println("The Account Number is :"+ sav1.accountId());
		System.out.println("The Balance is :"+ sav1.checkBalance());
		System.out.println(sav1.getInterest(2,4));
		}
}
