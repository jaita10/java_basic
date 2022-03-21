package com.training.cg;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentDisplay {
	public static void main(String args[]) 
	{
		Student s1 = new Student("AC100","Aisha",90,"27J.rh");
		Student s2 = new Student("AC200","Riya",50,"27p.rh");
		Student s3 = new Student("AC300","Araav",120,"27hu.rh");
		Student s4 = new Student("AC400","Priya",80,"27bh.hh");
		Student s5 = new Student("AC500","Neha",100,"27gyu.rh");
		
		List<Student> allStudents = new LinkedList<Student>();
		
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		allStudents.add(s4);
		allStudents.add(s5);
		
		Collections.sort(allStudents, new NameComparator());
		
		for(Student s:allStudents) {
			System.out.println("Student Id :"+ s.studId);
			System.out.println("Student Name :"+ s.studName);
			System.out.println("Student Grade :"+ s.grade);
			System.out.println("Address of the student: "+s.studAddress);
			System.out.println();
		}
	
	}
	

}
