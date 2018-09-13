package arrays;

/**  BasicArray.java       Author: Lewis/Loftus
 * Demonstrates basic array declaration and use.
 */
public class BasicArray
{
    /**
     * Creates an array, fills it with various integer values,
     *  modifies one value, then prints them out.
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args)
    {
        final int LIMIT = 15, MULTIPLE = 10;

        int[] list = new int[LIMIT];

        //  Initialize the array values
        for (int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;

        // list[5] = 999;  // change one array value

        //  Print the array values
        for (int value : list) {
            System.out.print(value + "  ");
        }

        System.out.println();

    }
}
