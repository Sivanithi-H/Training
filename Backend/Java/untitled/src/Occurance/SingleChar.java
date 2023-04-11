package Occurance;

public class SingleChar {

    public void method() {
        String name = "trustrace";
        char fWord = 't';
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == fWord) {
                count++;
            }
        }
//        long count = name.chars()
//                        .filter(c -> c == fWord).count();
        System.out.println("Occurrences of " + fWord + " are " + count);
    }
}
