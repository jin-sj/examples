package writingClasses;

public class Die {
    public final static int MAX = 6;
    private int faceValue;

    public Die() {
        faceValue = 1;
    }


    public int roll() {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString() {
        return "Face value:" + faceValue;
    }
}
