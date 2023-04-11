package vowelsOcc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a[] = {'a','e','i','o','u'};
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < a.length; j++) {
                if (str.charAt(i) == a[j]) {
                    count++;
                }
            }
            System.out.println("occurance of are " + count);
        }
        System.out.println("occurance of vowels are " + count);
    }
}