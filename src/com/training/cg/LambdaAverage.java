
//Java 8 Changes
//1. Lambda Expression

package com.training.cg;

public class LambdaAverage {
	
	public static void main(String args[]) {
		//Addition add = new Addition();
		
		DemoInterface2 d2 =(a,b,c) ->{
			System.out.println("Average is : "+((a+b+c)/3));
		};
		d2.show(100,20,30);
		d2.show(100,200,30);
		d2.show(100,22,91.90);
	}
}

