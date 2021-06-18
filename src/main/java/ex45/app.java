package ex45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class app {


    public static void main(String[] args)  {

        Scanner newScan = new Scanner(System.in);

        //Prompt and save the output file name.
        System.out.print("What is the name of your output file? ");
        String outputFileName = newScan.nextLine();

        //Create a text editor and set its attributes.
        textEditor editor = new textEditor();
        editor.fileName = "src/main/java/ex45/exercise45_input.txt";
        editor.fileDestination = "src/main/java/ex45/" + outputFileName;
        editor.target = "utilize";
        editor.replacement = "use";

        //Run the function in the editor that writes and creates the new file.
        editor.replaceTextFile();


    }


}
