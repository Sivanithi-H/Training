import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnotherWayUsingLinkedHashMap {

    public static void anotherMethod(String str) {
        Map<Character, Long> charCount = str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNotRepeat = charCount
                .entrySet().stream()
                .filter((e) -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst();

        if (firstNotRepeat.isPresent()) {
            System.out.println("firstNonRepeat :" + firstNotRepeat.get());
        }
    }
}
