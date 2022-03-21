package com.training.cg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class FileWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CG\\Java Basics\\Temp1.txt");
		char[] arr = new char[(int)file.length()];
		FileReader input = null;
		BufferedWriter output = null ;
		BufferedReader br = null;
		
		try {
			
			FileWriter fw = new FileWriter(file);
			
			output = new BufferedWriter(fw);
			
//			output.write("This input is from java1 ");//it replaces the previous data with the new one
			
			Writer ft = output.append("This input is from java2");
			
			output.close();
			
			input = new FileReader("C:\\Users\\HP\\eclipse-workspace\\CG\\Java Basics\\Temp1.txt");
			
			br = new BufferedReader(input);
			
			br.lines().forEach(line1 -> System.out.println(line1));
			//show the output
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
//			output.close();
//			br.close();
		}
		
	}
}
