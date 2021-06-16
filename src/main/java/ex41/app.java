package ex41;
import java.io.*;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {

        //Create variables for the file we want to read from and write to.
        String sourceFile = "src/main/java/ex41/exercise41_input.txt";
        String destinationFile = "src/main/java/ex41/exercise41_output.txt";

        //Create an Arraylist to save the input and output text on.
        ArrayList<String> lines = new ArrayList<String>();

        //Use our method to read input from file into arraylist.
        readInto(lines, sourceFile);

        //Sort the arrayList.
        Collections.sort(lines);

        //Use our method to write input from an Arraylist to a file.
        writeUpon(lines, destinationFile);

    }

    //Method that uses our file reader to read input from a file into an ArrayList.
    public static String readInto(ArrayList<String> readerDestination, String sourceFile) {

        //This variable will be returned.
        //It is to be set as the return value of the method that reads in our reader.
        //The return value of this method will tell us if the read was a success or failure to test it easily.
        String ret= "";

        //Create a reader.
        Reader r = new Reader();

        //Set source file for reader.
        r.fileName = sourceFile;

        //Set the destination array for the reader.
        r.listOfLines = readerDestination;

        //Raed the input from file to arraylist.
        ret = r.readInputFromFile();

        //Set our arrayList equals to the arrayList with the input.
        readerDestination = r.returnArrayList();

         return ret;

    }

    //Method that uses our file writer to write input from an ArrayList to a file.
    public static String writeUpon(ArrayList<String> writerSource, String destinationFile) {

        //This variable will be returned.
        //It is to be set as the return value of the method that writes in our writer.
        //The return value of this method will tell us if the write was a success or failure to test it easily.
        String ret= "";

        //Create a writer.
        Writer w = new Writer();

        //Set the fileName for the writer.
        w.fileName = destinationFile;

        //Set the source ArrayList for the writer.
        w.listOfLines = writerSource;

        //Write to the destination file.
        ret = w.writeInputToFile();

        return ret;

    }


}
