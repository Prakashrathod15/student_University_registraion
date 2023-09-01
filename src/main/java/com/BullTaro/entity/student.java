package com.BullTaro.entity;

public class student {
	
	String studentName;
	String password;
	public student(String studentName, String password) {
		super();
		this.studentName = studentName;
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
