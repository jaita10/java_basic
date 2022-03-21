package com.training.cg;

import java.util.Comparator;

public class NameComparator2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.grade()>o2.grade()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	

}
