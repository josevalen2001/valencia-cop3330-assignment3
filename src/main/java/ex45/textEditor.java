package ex45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


//App that changes all occurrences of a target word in a file for a replacement word.
public class textEditor {

    //Create attributes to be set by a user
    String fileName;
    String fileDestination;
    String target;
    String replacement;

    //Create function that does the text editing.
    public String replaceTextFile() {

        //Save the path of the original and destination file and our Charset
        Path path = Paths.get(fileName);
        Path destinationPath = Paths.get(fileDestination);
        Charset charset = Charset.forName("UTF-8");

        //Use a scanner to read to origin file and a writer to write the new modified file.
        try {

            //Create a new writer and scanner with the correct paths to read a write into.
            BufferedWriter writer = Files.newBufferedWriter(destinationPath, charset);
            Scanner newScan = new Scanner(path, charset.name());

            //Create variable for the line we are reading.
            String currLine;

            //Keep scanning every line...
            while (newScan.hasNextLine()) {

                currLine = newScan.nextLine();

                //Replace the target word for the replacement.
                currLine = currLine.replaceAll(target, replacement);

                //Write to our new file.
                writer.write(currLine);
                writer.newLine();

            }

            //Close the scanner ans writer and return the success message.
            newScan.close();
            writer.close();
            return "Success";

        } catch(Exception ex){

            //If there was an exception, then return failure.
            return "Failure";

        }
    }

}
