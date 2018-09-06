package collections;

import java.util.ArrayList;

/** This class demonstrates that ArrayList could be a parameter to a method, and
 *  shows that if it's a parameter, we can change the elements of the ArrayList */
public class ArrayListHelper {
    /** A method that takes an ArrayList of integers and n
     * and multiplies each element by n
     *
     * @param arr ArrayList of integers
     * @param n a number by which to multiply each element of the ArrayList
     */
    public static void mult(ArrayList<Integer> arr, int n) {

        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) * n);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList();
        myArray.add(5);
        myArray.add(10);
        myArray.add(7);

        for (Integer elem : myArray) {
            System.out.println(elem);
        }

        System.out.println("myArray before invoking mult: ");
        System.out.println(myArray);
        ArrayListHelper.mult(myArray, 10);
        System.out.println("myArray after invoking mult (each element is multiplied by 10:");
        System.out.println(myArray);
    }

}
