package com.tnsif.singlelevelinheritance;

//Child class
public class Student extends Citizen {

	public Student(String name, String aadharNo, String address, long phNo, int rollNo, String collegeName) {
		super(name, aadharNo, address, phNo);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public Student() {
		super();
	}

	private int rollNo;
	// private String Name;
	private String collegeName;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhNo()=" + getPhNo()
				+ "]";
	}

	/*
	 * @Override public String toString() { return "Student [rollNo=" + rollNo +
	 * ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]"; }
	 * 
	 */

}
