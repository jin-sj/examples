package conditionals;

import java.util.Objects;

/** Represents a circle. Overrides the equals method.
 *  Used in CircleComparison example */
public class Circle {
    private float radius;
    public static final float EPS = 0.001f;

    public Circle(float radius) {
        this.radius = radius;
    }

    // Other methods could be added to the class - not shown in this code

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Circle)) // if other is not a Circle
            return false;

        if (this == other)
            return true; // point to the same objects

        Circle otherCircle = (Circle)other;
        if (Math.abs(this.radius - otherCircle.radius) < EPS)
            return true;
        else
            return false;
    }


    // Note: when we override equals, we should also override hashCode method to make
    // sure equal objects have the same hash code; you may ignore this for now -
    // we will talk about hash code later in the semester
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
