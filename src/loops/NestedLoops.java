package loops;

public class NestedLoops {


    /**
     * The following method shows what happens in a simple
     * nested loop. For each iteration of i, the j loop will
     * go through all of its iterations.
     */
    public static void demonstrateBasicNestedLoops() {
        int num1 = 10;
        int num2 = 5;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println(i + ", " + j);
            }
            System.out.println();
        }
    }

    /**
     * Output the following to the console:
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * ...
     * @param n how many numbers to print in the last row
     */
    public static void printTriangleOfNumbers(int n) {
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NestedLoops.demonstrateBasicNestedLoops();
        NestedLoops.printTriangleOfNumbers(7);

    }
}
