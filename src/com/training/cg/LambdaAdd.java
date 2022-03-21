
//Java 8 Changes
//1. Lambda Expression

package com.training.cg;

public class LambdaAdd {
	
	public static void main(String args[]) {
		//Addition add = new Addition();
		
		DemoInterface d =(a,b) ->{
			System.out.println("Sum is :"+(a+b));
		};
		d.execute(100,98); //execute or show is the same thing
	}
}

