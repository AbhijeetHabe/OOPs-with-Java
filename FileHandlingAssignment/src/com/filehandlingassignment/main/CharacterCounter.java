package com.filehandlingassignment.main;

import java.io.*;

public class CharacterCounter {

	public static void main(String[] args) {
		 String fileName = args[0];

	        try {
	            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

	            int charCount = 0;
	            int c;

	            while ((c = fileReader.read()) != -1) {
	                if (Character.toLowerCase((char)c) == 't') {
	                    charCount++;
	                }
	            }
	            fileReader.close();

	            System.out.println("Number of times 't' occurs in the file: " + charCount);

	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	}

}
