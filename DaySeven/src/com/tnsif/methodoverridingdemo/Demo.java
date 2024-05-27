package com.tnsif.methodoverridingdemo;

public class Demo {

	public static void main(String[] args) {
		RBI rbi; //object reference
		
		
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
		
		rbi=new Axis();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());

	}

}
