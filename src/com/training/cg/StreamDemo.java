package com.training.cg;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("ram","","gj","yu","hu","");
		
		Stream<String> stream = strings.stream();
		Stream<String> stream1 = strings.stream();
		
		long counter = stream.filter(ch -> !ch.equals("")).count();
		
		System.out.println("Total Strings are: "+counter);
		
		stream1.filter(ch -> !ch.equals("")).forEach(name->System.out.println(name));

	}

}
