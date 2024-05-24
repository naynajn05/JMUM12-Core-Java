//demostrate static method and block
package com.tnsif.daysix.staticdemo;

public class MyClass {
//instance variable
	private int section;
	
	//static variable
	private static int srNo;
	
	static
	{
		System.out.println("Inside the Static block");
		srNo=10;
	}

	public MyClass() {
		System.out.println("Inside the constructor");

		this.section++ ;
		this.srNo++;
	}
	
	
	//instance method
	void print()
	{
		System.out.println(srNo);
		System.out.println(section);
		
	}
	
	//static method
	static void display()
	{
		System.out.println(srNo);
		//System.out.println(section);
		
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	
	
	
}
