package com.filehandlingassignment.main;

import java.io.*;

public class WordCounter {

	public static void main(String[] args) {
		String fileName = args[0];

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

            int wordCount = 0;

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            fileReader.close();

            System.out.println("Number of words in the file: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
