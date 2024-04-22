package com.tnsif.hierarchical;

//child 1 class
public class Student extends Person {

	private String branch;
	private int rollNo;
	private String year;


	
	public Student(String name, String gender, int age, String branch, int rollNo, String year) {
		super(name, gender, age);
		this.branch = branch;
		this.rollNo = rollNo;
		this.year = year;
	}
	
	public Student( ) {
		
		branch = "CSE";
		rollNo = 12;
		year = "TE";
	}


	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + ", rollNo=" + rollNo + ", year=" + year + ", toString()="
				+ super.toString() + "]";
	}

	

}
