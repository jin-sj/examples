package conditionals;

import java.util.ArrayList;

/** Class CircleComparison demonstrates that one can not use == to compare objects
 * for equality.
 */
public class CircleComparison {
    public static void main(String[] args) {
        // Two circles, same radius
        Circle c1 = new Circle(1.0f);
        Circle c2 = new Circle(1.0f);

        System.out.println(c1 == c2); // false!

        System.out.println(c1.equals(c2)); // true!

        ArrayList<Circle> arr = new ArrayList();
        arr.add(c1);
        boolean c = arr.contains(new Circle(1.0f)); // true
        // c would be false if we did not override the equals method
        System.out.println(c);
    }
}
