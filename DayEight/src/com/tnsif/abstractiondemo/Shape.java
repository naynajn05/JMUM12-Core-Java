//to demonstrate abstraction
package com.tnsif.abstractiondemo;

public abstract class Shape {
	
	protected double area;
	
	
	
	//solid/concrete method
	void show()
	{
		System.out.println(area);
	}
	
	//abstract method
	abstract void calArea();
	

}
