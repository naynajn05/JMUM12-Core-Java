package com.tnsif.hierarchical;

//child 2 class
public class Employee extends Person {

	private int empId;
	private long salary;
	private String designation;

	public Employee(String name, String gender, int age, int empId, long salary, String designation) {
		super(name, gender, age);
		this.empId = empId;
		this.salary = salary;
		this.designation = designation;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", designation=" + designation + ", toString()="
				+ super.toString() + "]";
	}


}
