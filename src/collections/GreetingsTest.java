package collections;

/** A class that shows how to use class Greetings */
public class GreetingsTest {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.addGreeting("Hello");
        g.addGreeting("Hola");
        g.addGreeting("Bon jorno");
        g.addGreeting("Namaste");
        g.printGreetings();
    }
}
