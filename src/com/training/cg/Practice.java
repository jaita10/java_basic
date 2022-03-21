package com.training.cg;

public class Practice {

	public static void main(String[] args) {
		double[] arrayA = {2,30,4.8,5,6.9,17.90,28.54,19};
		double length = arrayA.length;
		double sum = 0 ;
		for(double i=0;  i<arrayA.length; i++) {
			sum = sum +arrayA[(int) i];
		}
		System.out.println("Sum of the array is : "+sum);
		double avg = (sum/length);
		System.out.println("Average of the array is : "+avg);

	}

}
