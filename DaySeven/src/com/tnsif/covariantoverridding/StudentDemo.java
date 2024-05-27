package com.tnsif.covariantoverridding;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		// Student s2= new Student();

		//Student s2 = (Student) s1.clone();
		Student s2=s1.clone();
		System.out.println(s1);

		System.out.println(s2);
	}

}
