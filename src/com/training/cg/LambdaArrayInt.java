
//Java 8 Changes
//1. Lambda Expression

package com.training.cg;

public class LambdaArrayInt {
	
	public static void main(String args[]) {
		//Addition add = new Addition();
		
		DemoInterface3 d3 =(a) ->{
			
			int sum =0;
			for(int i =0;i<a.length;i++) {
				sum = sum + a[i];
			}
			System.out.println("Sum of the array is : "+sum);
			int avg = (sum/(a.length));
			System.out.println("Average of the array is : "+avg);
		};
		int[] arrayA = {2,30,4,5,6,17,28,19};
		d3.show(arrayA);
	}
}

