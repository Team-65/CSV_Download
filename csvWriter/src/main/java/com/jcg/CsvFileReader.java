package com.jcg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *  this code does not function as it assumes the directory the file is located in
 */
public class CsvFileReader {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";

	public static void readCsvFile(String fileName) {  //file name in this instance is the directory and the name of the file

		BufferedReader fileReader = null;

        try {


            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {  //checks to see if there is anything writen on the line
                	//Create a new object and fill data
				}
            }
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }

	}

}
