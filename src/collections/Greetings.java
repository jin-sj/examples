package collections;

import java.util.ArrayList;
/** The example demonstrates how to use ArrayList
 * to store a collection of strings */
public class Greetings {
    private ArrayList<String> greetings;

    /**
     * Constructor for class Greetings
     */
    public Greetings() {
        greetings = new ArrayList<>(); // created an object of class ArrayList
    }

    /**
     * Adds a new greeting s to the ArrayList of greetings
     * @param s a new greeting
     */
    public void addGreeting(String s) {
        greetings.add(s);
    }

    /**
     * Prints all greetings from the ArrayList: one greeting on each line.
     */
    public void printGreetings() {
        for (String s: greetings) {
            System.out.println(s);
        }
    }
}
