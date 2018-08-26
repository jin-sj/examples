package javaBasics;

import java.util.Scanner;

/**
 * Echo class - demonstrates the use of Scanner to
 * read keyboard input
 * From Lewis/Loftus, Java Software Solutions
 */

public class Echo {
    /** Reads a character string from the user and
     *  prints it to the console.
     *
     * @param args arguments to the program; not used in this example
     */
    public static void main(String[] args)
    {
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        message = scan.nextLine(); // read what the user entered

        System.out.println("You entered: '" + message + "'");
    }
}
