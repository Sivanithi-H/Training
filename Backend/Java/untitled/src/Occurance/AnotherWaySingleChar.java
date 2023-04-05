package Occurance;

public class AnotherWaySingleChar {

    public void method2() {
        String name = "trustrace";
        char fWord = 't';


        long count = name.chars()
                .filter(c -> c == fWord).count();
        System.out.println("Occurrences of " + fWord + " are " + count);
    }
}
