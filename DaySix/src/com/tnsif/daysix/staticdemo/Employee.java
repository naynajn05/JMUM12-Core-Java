//demonstrate static variable
package com.tnsif.daysix.staticdemo;

public class Employee {
	//data members-instance 
	private String name;
	private int id;
	
	//data member-static
	 static String companyName="TNSIF";

	public Employee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "companyName=" + companyName + "]";
	}
	
	
	
	
	

}
