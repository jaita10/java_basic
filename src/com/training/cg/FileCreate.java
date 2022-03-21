package com.training.cg;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CG\\Java Basics\\Temp1.txt");
		
		boolean val = false;
		
		try {
			val = file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(val) {
			System.out.println("File created successfully ");
		}
		else {
			System.out.println("File creation failed ");
		}
	}

}
