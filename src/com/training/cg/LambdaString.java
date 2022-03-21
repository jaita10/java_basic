package com.training.cg;

public class LambdaString {
	
	public static void main(String[] args) {
			
		DemoInterface5 d5 =(a,b) ->{
			System.out.println("String is :"+a+b);
		};
		
		d5.show("bug"," is not there");
	}
}