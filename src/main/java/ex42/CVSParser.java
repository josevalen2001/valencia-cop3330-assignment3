package ex42;

import java.util.ArrayList;

public class CVSParser {

    //Create an attribute to save the input that has to be parsed so that the user can set it.
    String inputNotParsed;

    //Create the main function of the class.
    //This function will parse the input and return it as an array with all the strings that were comma separated
    public String[] returnParsedInput() {

        //Use a for loop to count the number of times that this input will have to be split for the split function.
        int numberOfSplits = 0;
        for(int i = 0; i < inputNotParsed.length(); i++)
            if(inputNotParsed.charAt(i) == ',')
                numberOfSplits++;

        //Use the split function to parse the input and return it.
        //Use numberOfSplits + 1 as limit so that the last split does not get ignored.
        return inputNotParsed.split(",", numberOfSplits + 1);

    }



}
