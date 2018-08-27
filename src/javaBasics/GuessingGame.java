package javaBasics;

import java.util.Random;
import java.util.Scanner;

/** A program for playing a guessing game with a user:
 *  Computer "thinks" of a number; User guesses it.
 *  If the user guesses correctly, the program outputs "Correct!",
 *  otherwise "Sorry, wrong answer".
 */
public class GuessingGame {
    public void play() {
        Random r = new Random();
        System.out.println("I guessed the number from 1 to 5, guess it:");
        int number = r.nextInt(5) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        if (guess == number)
            System.out.println("Correct!");
        else
            System.out.println("Sorry, wrong, the number was " + number);

    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.play();
    }
}
