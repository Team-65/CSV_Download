package com.jcg;

/**
 * @author Jacob Remz
 *
 */
public class main {

    /**
     * @param args
     */
   // public static void main(String[] args) {

        String fileName ="random.csv";  // System.getProperty("user.home") +   //name to be used for csv file
        String[] csv_data = {"color","shape","wer", "test", "lol", "potato"};  //creation of an array of strings to be written in the csv file
        System.out.println("Write CSV file:");
        csvWriterClass.writeCsvFile(fileName,true,"C:/Users/Jacob/Downloads/", csv_data);

        //System.out.println("\nRead CSV file:");
        //CsvFileReader.readCsvFile(fileName);  //This section has been commented out because the meathod readCsvFile(String) does not function

  //  }

}
