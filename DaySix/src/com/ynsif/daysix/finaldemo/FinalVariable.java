//demonstrate final variables
package com.ynsif.daysix.finaldemo;

public class FinalVariable {
	
	//final int x; //final variable should initialized at the time of declaration
 
	final int x=56;
	
	//final ,static variable
	
	final static int y;
	
	final static int z=78;
	
	//instance method
	void change()
	{
		x=30; //can not reassigned
		y=39;
		z=56;
	}
	
	
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}


	static
	{
		y=20;
		//x=45;
		z=45;
	}
}
