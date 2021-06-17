package ex42;

import java.util.ArrayList;

public class app {

    public static void main(String[] args) {

        //Read the not parsed input into a string.
        String inputNotParsed;
        inputNotParsed = readInto("src/main/java/ex42/exercise42_input.txt");


        //Parse the string and save the separated values to an array.
        String[] parsedData;
        parsedData = parseInput(inputNotParsed);

        //Output in tabular form.
        //(I know there was a better way to do this... I'm tired.)
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        System.out.println(parsedData[0] + "      " + parsedData[1] + "       " + parsedData[2]);
        System.out.println(parsedData[3] + "   " + parsedData[4] + "       " + parsedData[5]);
        System.out.println(parsedData[6] + "     " + parsedData[7] + "     " + parsedData[8]);
        System.out.println(parsedData[9] + "     " + parsedData[10] + "     " + parsedData[11]);
        System.out.println(parsedData[12] + "     " + parsedData[13] + "  " + parsedData[14]);
        System.out.println(parsedData[15] + "     " + parsedData[16] + "      " + parsedData[17]);
        System.out.println(parsedData[18] + "  " + parsedData[19] + "   " + parsedData[20]);


    }

    //Function to read from the file into a string.
    //This will read and save not parsed data.
    public static String readInto(String fileName) {

        //Create a string to save the data we are gonna read into.
        String input;

        //Create a readr and set its attributes.
        Reader r = new Reader();
        r.fileName  = fileName;
        r.textRead = "";

        //Read the data and save it in our string.
        r.readInputFromFile();
        input = r.returnTextRead();

        //Return the string.
        return input;

    }

    //Function to parse the input with our CVSParser
    public static String[] parseInput(String input) {

        //Create an array where the parsed values will be saved
        String[] ret;

        //Create our parser and set its parameter.
        CVSParser p = new CVSParser();
        p.inputNotParsed = input;

        //Use our CVSParser to parse the data and save it.
        ret = p.returnParsedInput();

        //return the array.
        return ret;


    }



}
