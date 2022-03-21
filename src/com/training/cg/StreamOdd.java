package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOdd {

	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(2,3,4,7,8,7);
		
		Stream<Integer> s1 = int1.stream();
		Stream<Integer> s2 = int1.stream();
		
		long counter = s1.filter(ch -> ch%2!=0).count();
		
		System.out.println("Total odd numbers are: "+counter);
		
		System.out.print("Those Odd numbers are: ");
		s2.filter(ch -> ch%2!=0).forEach(val->System.out.print(val+","));
	}
}
