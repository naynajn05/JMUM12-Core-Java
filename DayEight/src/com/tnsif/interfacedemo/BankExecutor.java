package com.tnsif.interfacedemo;

public class BankExecutor {

	public static void main(String[] args) {
		//create a instance of a Bank
		Bank axis=new BankImpl();
		
		//Create a instance of a Account
		Account account1=new Account(123,"Sanjivani",50000,axis);
		
		
	
		axis.deposit(account1, 12000);
		axis.withdraw(account1, 45000);
		axis.withdraw(account1, 45000);
		
		System.out.println(account1);
		
		

	}

}
