package com.tnsif.constructordemo;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		/*
		 * System.out.println(c1.getCity()); System.out.println(c1.getId());
		 * System.out.println(c1.getName());
		 */
		System.out.println(c1);
		c1.setId(12);
		c1.setName("Sanjivani");
		c1.setCity("Akola");
		
		/*
		 * System.out.println(c1.getCity()); System.out.println(c1.getId());
		 * System.out.println(c1.getName());
		 */
		
		System.out.println(c1);
		
		Customer c2=new Customer("Dhanraj",14,"Amravati");
		System.out.println(c2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		
		System.out.println("Enter your city");
		String city=sc.next();

		
		Customer c3=new Customer(name,id,city);
		System.out.println(c3);
	}

}
