package ex41;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class appTest {

    //Test to know if our reader is successful.
    //If it isn't that means an exception was thrown.
    @Test
    void readInto_is_successful() {

        //Create an app.
        app testApp = new app();

        //Create test variables.
        ArrayList<String> testArray = new ArrayList<>();
        String testFile = "src/main/java/ex41/exercise41_input.txt";

        //Create expected and actual output for test.
        String expected = "Success";
        String actual = app.readInto(testArray, testFile);

        //The returned string of readInto tells us if the reader it is using was successful or not.

        //Test.
        assertEquals(expected, actual);

    }

    @Test
    void writeUpon_is_successful() {

        //Create an app.
        app testApp = new app();

        //Create test variables.
        ArrayList<String> testArray = new ArrayList<>();
        String testFile = "src/main/java/ex41/exercise41_input.txt";

        //Create expected and actual output for test.
        String expected = "Success";
        String actual = app.writeUpon(testArray, testFile);

        //The returned string of writeUpon tells us if the writer it is using was successful or not.

        //Test.
        assertEquals(expected, actual);


    }
}