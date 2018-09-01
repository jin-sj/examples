package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** This class demonstrates how to use class Scanner to read lines
 * from the file.
 * */
public class SongReader {

    /**
     * Create a file, pass it to the constructor of the Scanner,
     * Read line by line, and print to the console
     * until there is nothing to read;
     * @param args command line arguments - ignored in this example
     */
    public static void main(String[] args) {
        File file = new File("song.txt");
        Scanner sc;
        try {
            sc = new Scanner(file); // note that Scanner constructor takes a file
            while (sc.hasNextLine()) { // while there is something to read
                String s = sc.nextLine(); // read a line
                System.out.println(s); // output in the console
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find a file");
        }

    }
}
