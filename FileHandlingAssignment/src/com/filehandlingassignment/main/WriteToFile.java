package com.filehandlingassignment.main;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		String text = "When in the Course of human events, it becomes necessary for one people to\n" +
                "dissolve the political bonds which have connected them with another, and to\n" +
                "assume among the powers of the earth, the separate and equal station to which\n" +
                "the Laws of Nature and of Nature's God entitle them, a decent respect for the\n" +
                "opinions of mankind requires that they should declare the causes which impel\n" +
                "them to the separation";

        try {
            StringWriter writer = new StringWriter();
            writer.write(text);

            StringReader reader = new StringReader(writer.toString());

            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("textfile.txt"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("textfile.txt"));

            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
