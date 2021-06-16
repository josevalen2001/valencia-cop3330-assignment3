package ex41;

import java.io.*;
import java.util.*;

//Class to read in text from a .txt file.
//The text read in will be saved in an arrayList which is to be returned.
public class Reader {


    //File to be read.
    //This is the file that we are gonna read from.
    //Saving it as an attribute allows for easy use of this file in every method of this class.
    String fileName;

    //ArrayList where the input from the file will be saved.
    //Created as an attribute to use it in various methods.
    //Return this array to return the input in the file.
    ArrayList<String> listOfLines;


    //Create a class to read the input from the desired file and save the lines of input in the arrayList.
    public String readInputFromFile() {

        String status = "";

        //Use a try/catch so that an exception in case the file is not found will not crash our code.
        try {

            //Use a buffered reader and a file reader to read in input from the file.
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            //Create a String variable to save the line that is currently being read from the file.
            String currLine;

            //Keep reading lines until we find the end of the text in the file.
            while((currLine = reader.readLine()) != null)

                //Save the lines of text being read in the arrayList created to store them.
                listOfLines.add(currLine);

            //Close the reader.
            reader.close();

            //Set and return status to know method worked.
            status = "Success";
            return status;

        //Set what to do if an exception is caught.
        } catch(Exception ex) {

            //Set and return status to know method failed.
            status = "Failure";
            return status;
        }
    }

    //Function to return the arrayList with the input from the file to read.
    public ArrayList<String> returnArrayList() {

        //return the arrayList.
        return listOfLines;
    }

}


