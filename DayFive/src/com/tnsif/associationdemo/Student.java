package com.tnsif.associationdemo;
//Container class
public class Student {
	
	private String name;
	
	private int rollNo;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(String name, int rollNo, Address address) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
	public void displayData()
	{
		System.out.println("Student Name is "+name);
		System.out.println("Student Roll No is "+rollNo);
		System.out.println("Student Address is "+address.getStreet() +" "
				+address.getCity()+" "
				+address.getState()+" "
				+address.getZipcode());
	}

	
	
}
