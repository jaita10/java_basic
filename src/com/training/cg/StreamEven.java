package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEven {

	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(11,45,6,73,7,7,36,3,46,453,78);
		
		Stream<Integer> s1 = int1.stream();
		long counter = s1.filter(ch -> ch%2==0).count();
		System.out.println("Total odd numbers are: "+counter);
		
		Stream<Integer> s2 = int1.stream();
		System.out.print("Those Even numbers are: ");
		s2.filter(ch -> ch%2==0).forEach(val->System.out.print(val+","));
		
		Stream<Integer> s3 = int1.stream();
		Optional<Integer> even = s3.filter(ch -> ch%2==0).reduce((a,b) -> (a+b));
		System.out.println();
		System.out.println("The sum of the even numbers : ");
		even.ifPresent(System.out::println);

	}

}
