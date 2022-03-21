package com.training.cg;

public class LambdaDemo {

	public static void main(String[] args) {
		
		DemoInterface3 d3 =(a) ->{
			
			System.out.println("Number of the array is: ");
			for(int i =0;i<a.length;i++) {
				System.out.print(a[i]+",");
				}
	};
	int[] n = {3,5,9,5,8};
	d3.show(n);
	}
}
