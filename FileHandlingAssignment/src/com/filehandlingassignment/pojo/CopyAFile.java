package com.filehandlingassignment.pojo;

import java.io.*;

public class CopyAFile {
	public static void main(String[] args) {
		String fromFileName = args[0];
		String toFileName = args[1];
		
		try {
			FileInputStream fromFile = new FileInputStream(fromFileName);
			FileOutputStream toFile = new FileOutputStream(toFileName);
			
			BufferedInputStream fromStream = new BufferedInputStream(fromFile);
            BufferedOutputStream toStream = new BufferedOutputStream(toFile);

            byte[] buffer = new byte[1096];
            int bytesRead;

            // Read bytes from the source file and write them to the destination file
            while ((bytesRead = fromStream.read(buffer)) != -1) {
                toStream.write(buffer, 0, bytesRead);
            }
            
            fromFile.close();
            toFile.close();

            System.out.println("File copied successfully.");
		}
		catch (IOException e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}
}
