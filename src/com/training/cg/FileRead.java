package com.training.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CG\\Java Basics\\Temp1.txt");
		char[] arr = new char[(int)file.length()];
		FileReader input = null;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			br.lines().forEach(line1 -> System.out.println(line1));
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}
