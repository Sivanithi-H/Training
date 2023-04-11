package Occurance;

public class AnotherWaySingleChar {

    public void method2() {
        String name = "trustrace";
        char fWord = 't';

        long count = name.chars()
                .filter(c -> c == name.charAt(1)).count();
        System.out.println("Occurrences of " + fWord + " are " + count);
    }
}
