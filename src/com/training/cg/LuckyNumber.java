package com.training.cg;
import java.util.*;
public class LuckyNumber {
		
		static int ln = 3;
		public static void main(String arg[]) {
			
			for(int count = 1;count<=10;count++) {
			Scanner n1 = new Scanner(System.in);
				
			System.out.println("Guess the lucky number between 1 to 10: ");
			int n = n1.nextInt();
				if(n != ln) {
				System.out.println("Not really!! try again");	
				}
				else {
				System.out.println("Congrats!! you guessed it right in "+count+" attempts");	
				}
			}
		}

	

}
