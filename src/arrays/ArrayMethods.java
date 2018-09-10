package arrays;

import java.util.Arrays;

/** Class ArrayMethods demonstrates how to use arrays as parameters
 *  to the methods, and how to modify them correctly */
public class ArrayMethods {

    /**
     * This method will add num to each element of arr
     * @param arr array of integers
     * @param num number to add
     */
    public static void addNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + num;
        }
    }

    /**
     * This method will not change array arr!
     * @param arr input array of integers
     * @param num number to add
     */
    public static void addNumberInvalid(int[] arr, int num) {
        for (int a: arr) { // a is a copy of the element
            a = a + num;
        }
    }

    /**
     * This method will not change array arr!
     * @param arr input array of integers
     * @param num number to add
     */
    public static void addNumberInvalidAgain(int[] arr, int num) {
        arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + num; // does not change the arr
            // that is passed as a parameter!
        }
    }

    public static void main(String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayMethods.addNumber(m1, 10);
        System.out.println(Arrays.toString(m1)); // m1 got changed!

        int[] m2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayMethods.addNumberInvalid(m2, 10);
        System.out.println(Arrays.toString(m2)); // m2 did not change!

        int[] m3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayMethods.addNumberInvalidAgain(m3, 10);
        System.out.println(Arrays.toString(m3)); // m3 did not change!

    }
}
