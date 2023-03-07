import java.util.LinkedHashMap;

public class Example {

    public static char firstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();       // Step 1: Create a LinkedHashMap to store the count of each character in the string

        for (char c : str.toCharArray()) {                                          // Step 2: Update the count of each character in the LinkedHashMap
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {                                          // Step 3: Find the first non-repeating character
            if (charCounts.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }
}

