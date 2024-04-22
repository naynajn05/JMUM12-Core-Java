//program to demonstrate constructor
package com.tnsif.constructordemo;

public class Customer {
	private String name;
	private int id;
	private String city;

	// Default Constructor
	Customer() {
		System.out.println("Default constructor");
		name = "Sejal";
		id = 10;
		city = "Shegoan";
	}

	//Para. Constructor
	public Customer(String name, int id, String city) {

		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	

}
