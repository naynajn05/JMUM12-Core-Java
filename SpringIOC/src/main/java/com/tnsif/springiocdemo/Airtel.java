package com.tnsif.springiocdemo;

public class Airtel implements Sim {
	
	Airtel()
	{
		System.out.println("Airtel costructor is called");
	}

	@Override
	public void calling() {
		System.out.println("Calling using Airtel Sim");
		
	}

	@Override
	public void browsing() {
		System.out.println("Browsing using Airtel Sim");
		
	}

}
