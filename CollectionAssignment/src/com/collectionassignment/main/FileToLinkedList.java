package com.collectionassignment.main;

import java.util.LinkedList;
import java.io.*;

public class FileToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lines = new LinkedList<>();
		
		String filePath = "C:\\Users\\abhij\\OneDrive\\Desktop\\ReadIt.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = br.readLine()) != null) {
				lines.add(line);
			}
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		
		lines.forEach(System.out::println);
	}

}
