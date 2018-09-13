package maps;

/** The Driver class for class PhoneBook */
public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Jones", 9001245);
        book.add("Li", 1234567);
        book.add("Kumar", 4135525);

        book.printInfo();
    }
}
