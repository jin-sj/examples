package maps;
import java.util.HashMap;

/** PhoneBook class uses a HashMap to store names and phone numbers.
 *  For simplicity, let's assume the phone numbers are local,
 *  without the area code. */
public class PhoneBook {
   private HashMap<String, Integer> book;

   public PhoneBook() {
       book = new HashMap();
   }

   public void add(String name, Integer number) {
       book.put(name, number);
   }

   public void printInfo() {
       for (String name: book.keySet()) {
           System.out.println(name + ": " + book.get(name));
       }
   }

}
