package com.training.cg;

public class Student {
	
	String studId;
	String studName;
	double grade;
	String studAddress;
	
	public Student(String studId, String studName ,double grade , String studAddress ) {
		this.studId = studId;
		this.studName = studName;
		this.grade = grade;
		this.studAddress = studAddress;		
	}
	public double grade() {
		return grade;
	}

}
