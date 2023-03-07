import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharUsingLinkedHashMap {

    public static void firstMethod(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        Character ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character is " + entry.getKey());
                break;
            }
        }
    }
}
