package com.tnsif.associationdemo;

public class AssociationDemo {

	public static void main(String[] args) {
		Address address=new Address("Gajanan Maharaj Street","Shegaon","Maharashtra",400001);
		Student student=new Student("Dhanraj",23,address);
		student.displayData();

	}

}
