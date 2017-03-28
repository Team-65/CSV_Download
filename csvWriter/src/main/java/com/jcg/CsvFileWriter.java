package com.jcg;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacob Remz
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\r\n";
	
	//CSV file header
	//private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

	public static void writeCsvFile(String fileName, boolean customDirectory,String saveDirectory, String[] data) {
		if(customDirectory){
			fileName = saveDirectory + fileName;
		}
		else{
			fileName = System.getProperty("user.home") + "/"+fileName;
		}

		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			//fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			//fileWriter.append(NEW_LINE_SEPARATOR);

			for (int i=0;i< data.length; i++) {
				fileWriter.append(data[i].toString());
				//fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			
			System.out.println("CSV file was created successfully !!!");
			System.out.println("CSV file name:"+fileName);
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
}
