package com.tnsif.functionalinterfacedemo;

public class Demo {

	public static void main(String[] args) {
		/*
		 * GreetImpl obj=new GreetImpl(); System.out.println(obj.greet());
		 */
		
		GreetInterface obj=()-> "Lambda Expression";
		System.out.println(obj.greet());
		
		
	}

}
