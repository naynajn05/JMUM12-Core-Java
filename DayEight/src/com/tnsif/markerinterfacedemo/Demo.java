package com.tnsif.markerinterfacedemo;

public class Demo {

	public static void main(String[] args) {
		Student s1=new Student("Sumit",34,22);
		
		//Student1 s2=new Student1();
		if (s1 instanceof Registrable)
		{
			System.out.println("Student is registered");
		}
		else
		{
			System.out.println("Student is not registered");

		}

	}

}
