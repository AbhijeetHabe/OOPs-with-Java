package com.filehandlingassignment.main;

import java.io.*;

public class WriteToFileKeyboard {

	public static void main(String[] args) {
		String fileName = args[0];

        try {
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));

            String line;
            while ((line = keyboardReader.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                }
                fileWriter.write(line);
                fileWriter.newLine();
            }

            keyboardReader.close();
            fileWriter.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
