package com.training.cg;

import java.util.ArrayList;
import java.util.List;

public class Grade {

	String[] grades = {"A","B","C","D"};
	
	List<String> gradeList = new ArrayList<String>()
	
	gradeList = Arrays.asList(grades);
	
	for(String str:gradeList) {
		if(!str.equals("A")||!str.equals("B")) {
			throw new Exception("Invalid Grade");
		}
	}
}


