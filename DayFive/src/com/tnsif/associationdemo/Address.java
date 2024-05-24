package com.tnsif.associationdemo;

//contained class
public class Address {
	private String Street;
	private String city;
	private String state;
	private int zipcode;
	
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address() {
		super();
	}
	public Address(String street, String city, String state, int zipcode) {
		super();
		Street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	

}
