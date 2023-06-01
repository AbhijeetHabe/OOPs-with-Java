package com.filehandlingassignment.pojo;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
        String fileName = args[0];

        try {
            FileInputStream file = new FileInputStream(fileName);

            int byteRead;
            while ((byteRead = file.read()) != -1) {
                System.out.print((char)byteRead);
            }
            file.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

	}

}
