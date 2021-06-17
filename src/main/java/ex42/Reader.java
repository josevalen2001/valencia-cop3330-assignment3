package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//Class to read in text from a .txt file.
//The text read in will be saved in an arrayList which is to be returned.
public class Reader {


    //File to be read.
    //This is the file that we are gonna read from.
    //Saving it as an attribute allows for easy use of this file in every method of this class.
    String fileName;

    //String where the input from the file will be saved.
    //Created as an attribute to use it in various methods.
    //Return this string to return the input in the file.
    String textRead;


    //Create a class to read the input from the desired file and save the lines of input in the arrayList.
    public void readInputFromFile() {

        //Use a try/catch so that an exception in case the file is not found will not crash our code.
        try {

            //Use a buffered reader and a file reader to read in input from the file.
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            //Create a String variable to save the line that is currently being read from the file.
            String currLine;

            //Keep reading lines until we find the end of the text in the file.
            while((currLine = reader.readLine()) != null)

                //Save the lines of text being read in a single string and add commas to separate values in different lines.
                textRead += currLine + ",";

            //Close the reader.
            reader.close();


        //Set what to do if an exception is caught.
        } catch(Exception ex) {

            //Exit function.
            return;
        }
    }

    //Function to return the string with the input from the file to read.
    public String returnTextRead() {

        //Create a string to return
        String ret = "";

        //Because of how we added commas after each line at reading the string to return will be the string we read into without the last comma.
        for(int i = 0; i < textRead.length() - 1; i++)
            ret += textRead.charAt(i);

        //return the string.
        return ret;
    }

}


