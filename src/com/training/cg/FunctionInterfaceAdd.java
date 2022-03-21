package com.training.cg;

import java.util.function.Function;

public class FunctionInterfaceAdd {
	
	public static void main(String args[]) {
		
		Function<Long, Long> f1 = (a)-> a + 98792;
		
		long p= f1.apply((long) 8107868);
		System.out.println(p);
	}

}
