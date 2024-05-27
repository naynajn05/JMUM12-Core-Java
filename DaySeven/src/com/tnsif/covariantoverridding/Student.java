package com.tnsif.covariantoverridding;


//Entity Class
public class Student implements Cloneable {
private int rollNo;
private String name;
private String dept;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
	
	
}

/*
 * public Object clone() throws CloneNotSupportedException { return
 * super.clone(); }
 */

public Student clone() throws CloneNotSupportedException
{
	return (Student)super.clone();
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
}


}
