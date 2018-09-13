package maps;

import java.util.HashMap;

/** Takes an array of words, and
 *  creates a HashMap that maps each unique word to
 *  the number of occurrences of this word in the array */
public class WordOccurrences {
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();

        String[] words = {"cat", "mail", "door", "cat"};
        for (String word : words) {
            Integer count = hMap.get(word);
            if (count == null)
                hMap.put(word, new Integer(1));
            else {
                count = count + 1;
                hMap.put(word, count);
            }
        }
        System.out.println(hMap);

    }
}
