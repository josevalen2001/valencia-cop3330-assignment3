package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class textEditorTest {

    //Test to see if our text editor works correctly.
    @Test
    void replaceTextFile_works_correctly() {

        //Create a text editor and fill its attributes manually
        textEditor editor = new textEditor();
        editor.fileName = "src/main/java/ex45/exercise45_input.txt";
        editor.fileDestination = "src/main/java/ex45/outputFile_test.txt";
        editor.target = "utilize";
        editor.replacement = "use";

        //Save the return statement of our tested function which tells us if it was a success or failure.
        String actual = editor.replaceTextFile();
        String expected = "Success";

        //Test
        assertEquals(expected, actual);


    }
}