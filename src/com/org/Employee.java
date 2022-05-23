package com.org;

public class Employee {

	int employeeid;
	String employeename;
	String employeedesignation;
	public Employee(int employeeid, String employeename, String employeedesignation) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeedesignation = employeedesignation;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeedesignation="
				+ employeedesignation + "]";
	}
	
	
	public void display() {
	       System.out.println("Calling Manager Display");
	}
	
	
}
	
	
	

