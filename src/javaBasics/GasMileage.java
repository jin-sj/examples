package javaBasics;

import java.util.Scanner;
/** The class demonstrates how to use Scanner and expressions in Java.
 */
public class GasMileage {
    public final static int GOOD_MPG = 45; // a constant is defined using "final static" keywords

    /**
     * Read miles and gallons from the keyboard input,
     * and compute mpg (miles per gallon).
     * @return miles per gallon computed using user input
     */
    public double computeMPG() {
        int miles;
        double gallons;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of miles: ");
        miles = scan.nextInt();
        System.out.println("Please enter the number of gallons: ");
        gallons = scan.nextDouble();

        double mpg = miles/gallons;
        boolean goodMpg = false;
        System.out.println(mpg);
        if (mpg > GOOD_MPG)
            goodMpg = true;
        System.out.println("Is this MPG good? " + goodMpg);

        return mpg;
    }

    public static void main(String[] args) {
        GasMileage gm; // reference to GasMileage
        gm = new GasMileage(); //create an object of class GasMileage and point gm to this object
        gm.computeMPG(); // call method computeMPG
    }
}
