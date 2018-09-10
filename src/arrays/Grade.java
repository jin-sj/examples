package arrays;

/** Grade.java       Author: Lewis/Loftus
 * Represents a school grade. */
public class Grade {
    private String name;
    private int lowerBound;

    /** Constructor:
     * Sets up this Grade object with the specified
     * grade name and numeric lower bound.
     * @param grade letter grade
     * @param cutoff cutoff score for this letter grade
     */
    public Grade(String grade, int cutoff)
    {
        name = grade;
        lowerBound = cutoff;
    }

    /** Returns a string representation of this grade.
     *
     * @return string
     */
    public String toString()
    {
        return name + "\t" + lowerBound;
    }

    /**
     * Name mutator (setter)
     * @param grade
     */
    public void setName(String grade)
    {
        name = grade;
    }

    /**
     * Lower bound mutator (setter)
     * @param cutoff integer cutoff
     */
    public void setLowerBound(int cutoff)
    {
        lowerBound = cutoff;
    }

    /** Name accessor
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /** Lower bound accessor. */
    public int getLowerBound()
    {
        return lowerBound;
    }
}
