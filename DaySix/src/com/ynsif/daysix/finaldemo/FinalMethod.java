//demonstrate final method
package com.ynsif.daysix.finaldemo;

public final class FinalMethod {
	final int a=20;

	
	FinalMethod()
	{
		System.out.println("Final method class");
	}
	
	//final method
	final void print()
	{
		System.out.println("Value of a: "+a);
	}

}
