package ex41;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

//Class will write into a file from a list of strings
//The text taken from the source arrayList will be written upon a destination file.
public class Writer {

    //File to be written.
    //This is the file that we are gonna write into.
    //Saving it as an attribute allows for easy use of this file in every method of this class.
    String fileName;

    //ArrayList where the text to be written in the output file is.
    //Created as an attribute to use it in various methods.
    ArrayList<String> listOfLines;

    //Create a class to write information into a file from an Arraylist of strings.
    public String writeInputToFile(){

        String status = "";

        //Use a try/catch so that an exception in case the file is not found will not crash our code.
        try{

            //Use a buffered writer and a file writer to read in input from the file.
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            //A little of formatting for this assignment...
            writer.write("Total of " + listOfLines.size() + " names.\n-----------------\n");

            //Write each String in the arrayList to our destination file.
            for(int i = 0; i < listOfLines.size(); i++)
                writer.write(listOfLines.get(i) + "\n");

            //Close the writer.
            writer.close();

            //Set and return the status to know that the method worked.
            status = "Success";
            return status;

        //In case an exception is thrown...
        } catch(Exception ex) {

            //Set and return status to know that the method failed.
            status = "Failure";
            return status;
        }

    }


}
