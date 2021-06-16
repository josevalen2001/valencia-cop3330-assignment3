package ex41;
import java.io.*;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<String>();

        Reader r = new Reader();
        r.fileName = "src/main/java/ex41/exercise41_input.txt";

        r.readInputFromFile(lines);

        for(int i = 0; i < lines.size(); i++)
            System.out.println(lines.get(i));


    }


    public void a(ArrayList<String> listOfLines, String fileName) {

        //Use a try/catch so that an exception in case the file is not found will not crash our code.
        try {

            //Use a buffered reader and a file reader to read in input from the file.
            BufferedReader reader = new BufferedReader(new FileReader("fileName"));

            //Create a String variable to save the line that is currently being read from the file.
            String currLine;

            //Keep reading lines until we find the end of the text in the file.
            while((currLine = reader.readLine()) != null)
                //Save the lines of text being read in the arrayList created to store them.
                listOfLines.add(currLine);

            //Close the reader.
            reader.close();

            //Set what to do if an exception is caught.
        } catch(Exception ex) {

            //Exit the function if an exception is caught.
            return;
        }
    }



}
