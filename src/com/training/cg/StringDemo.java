package com.training.cg;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str1 = "Hi ";
		String str2 = "Hello ";
		
//		StringBuilder sb = new StringBuilder("Icvxvzsd");  //not synchronized
//		sb.append(" am");
//		System.out.println(sb);   //synchronized
		
		StringBuffer sb1 = new StringBuffer("Ldssdvv");
		System.out.println(sb1.append(" t"));
		System.out.println(sb1.replace(1, 2, "6fsf7"));
		System.out.println("Deletion:"+sb1.delete(1, 4));
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.charAt(0));
		//System.out.println(sb1.setCharAt(0, "R"));
		System.out.println(sb1.indexOf("s"));
		System.out.println(sb1.substring(1, 5));
		System.out.println();
		
		
	}

}
