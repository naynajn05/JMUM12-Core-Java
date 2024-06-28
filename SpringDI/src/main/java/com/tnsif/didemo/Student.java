package com.tnsif.didemo;

public class Student {

	private String studentName;
	private int id;

	
	
	//DI using Constructor
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}




	/*
	 * // DI through setter method public void setStudentName(String studentName) {
	 * this.studentName = studentName; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + "]";
	}


	

}
