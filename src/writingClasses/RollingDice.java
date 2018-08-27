package writingClasses;

public class RollingDice {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();
        System.out.println(die1.getFaceValue());
        System.out.println(die2.getFaceValue());
    }
}
