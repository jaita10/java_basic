
//Java 8 Changes
//1. Lambda Expression

package com.training.cg;

public class LambdaArrayDouble {
	
	public static void main(String args[]) {
		//Addition add = new Addition();
		
		DemoInterface4 d4 =(a) ->{
			
			double sum =0;
			for(double i =0;i<a.length;i++) {
				sum = sum + a[(int)i];
			}
			System.out.println("Sum of the array is : "+sum);
			double avg = (sum/(a.length));
			System.out.println("Average of the array is : "+avg);
		};
		double[] arrayA = {2,30,4,5,6.6,17,28.8,19.9};
		d4.show(arrayA);
	}
}

