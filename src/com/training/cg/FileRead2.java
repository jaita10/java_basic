package com.training.cg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CG\\Java Basics\\Temp1.txt");
		char[] arr = new char[(int)file.length()];
		FileReader input = null;
		try {
			input = new FileReader(file);
			input.read(arr);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}finally {
			input.close();
		}
		
//		
//		boolean val = false;
//		
//		try {
//			val = file.createNewFile();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		if(val) {
//			System.out.println("File created successfully ");
//		}
//		else {
//			System.out.println("File creation failed ");
//		}
		System.out.println("Reading the file::");
		System.out.println(arr);
	}

}
