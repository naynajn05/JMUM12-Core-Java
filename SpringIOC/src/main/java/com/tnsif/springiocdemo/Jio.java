package com.tnsif.springiocdemo;

public class Jio implements Sim {

	
	Jio()
	{
		System.out.println("Jio Constructor");
	}
	@Override
	public void calling() {
		System.out.println("Calling using Jio Sim");
		
	}

	@Override
	public void browsing() {
		System.out.println("Browsing using Jio Sim");
		
	}
}
