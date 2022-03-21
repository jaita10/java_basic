package com.training.cg;

import java.util.HashSet;
import java.util.Set;

public class BankDemo {
	public static void main(String args[])
	{
		SavingAccount sav1 = new SavingAccount("Aisha","AC100",50000);
		SavingAccount sav2 = new SavingAccount("Ayush","AC200",10000);
		SavingAccount sav3 = new SavingAccount("Riya","AC300",20000);
		SavingAccount sav4 = new SavingAccount("Araav","AC400",5000);
		
		Set<SavingAccount> allsav = new HashSet<SavingAccount>();
		allsav.add(sav1);
		allsav.add(sav2);
		allsav.add(sav3);
		allsav.add(sav4);
		
		for(SavingAccount sav:allsav) {
			sav.deposit(20000);
			sav.withdraw(10000);
			System.out.println("The Account Holder is :"+ sav.accountHolder());
			System.out.println("The Account Number is :"+ sav.accountId());
			System.out.println("The Balance is :"+ sav.checkBalance());
			System.out.println("The Interest is :"+ sav.getInterest(2,4));
			System.out.println();
		}
	}
}