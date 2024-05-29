//demonstrate interface
package com.tnsif.interfacedemo;

public interface Bank {
	double Min_Balance=1000;
	double Deposit_Limit=25000;
	double Interest_Rate=7.8d;
	
	void deposit(Account account,double amount);
	
	void withdraw(Account account,double amount);
	
	
}
