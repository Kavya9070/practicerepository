package com.atos;

public class Student {
private int studentid;
private String studentname;
private int studentmarks;
private boolean studentstatus;

public Student() {
	super();
	studentstatus=true;
}

public Student(int studentid, String studentname, int studentmarks, boolean studentstatus) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentmarks = studentmarks;
	this.studentstatus = studentstatus;
}

public int getStudentid() {
	return studentid;
}

public void setStudentid(int studentid) {
	this.studentid = studentid;
}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public int getStudentmarks() {
	return studentmarks;
}

public void setStudentmarks(int studentmarks) {
	if(studentstatus==true)
	this.studentmarks = studentmarks;
	else
		System.out.println("Status Inactive");
}

public boolean isStudentstatus() { 
	return studentstatus;
}

public void setStudentstatus(boolean studentstatus) {
	this.studentstatus = studentstatus;
}

@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmarks=" + studentmarks
			+ ", studentstatus=" + studentstatus + "]";
}


	
	
	
	
	
}
