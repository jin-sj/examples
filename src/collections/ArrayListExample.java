package collections;

import java.util.ArrayList;

/** The class shows a very simple example of using an ArrayList */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myStrings = new ArrayList();
        myStrings.add("Apples");
        myStrings.add("Oranges");
        System.out.println(myStrings);
        System.out.println(myStrings.get(0)); // access the first string
        System.out.println(myStrings.get(1)); // access the second string


    }
}
