import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharUsingLinkedHashMap {

    public static void firstMethod(String str) {

    Map<Character, Integer> charcount = new LinkedHashMap<>();

    Character ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            if (charcount.containsKey(ch)) {

                charcount.put(ch, charcount.get(ch) + 1);
            } else {
                charcount.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character is " + entry.getKey());
                break;
            }
        }
    }
}
