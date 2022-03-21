package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIncrease {

	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(100,200,300,400);
		
		Stream<Integer> s1 = int1.stream();
		Stream<Integer> s2 = int1.stream();
		Stream<Integer> s3 = int1.stream();
		
		s1.map(i->i+(i*10/100)).forEach(data->System.out.println(data));

		System.out.println("-------------------------");
		
		s2.map(i->i*i).forEach(data->System.out.println(data));
		
		System.out.println("-------------------------");
		
		List<Integer> squareValues = s3.map(i->i*i).collect(Collectors.toList());
		System.out.println(squareValues);
		
		System.out.println("-------------------------");
		
		for(int a: int1) {
			System.out.println(a);
		}
	}

}
