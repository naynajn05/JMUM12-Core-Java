package com.tnsif.interfacedemo;

public class BankImpl implements Bank {

	@Override
	public void deposit(Account account, double amount) {
		if(amount>Deposit_Limit)
		{
			System.err.println("Deposit Limit Exceeded..");
			
		}else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("Amount is deposited to account "+account.getAccNo());
		}
		
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance()-amount>=Min_Balance)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println(amount+" Rs is withdrawn from the account "+account.getAccNo());
		}else
		{
			System.err.println("Insufficient Balance..");
		}
		
	}


}
