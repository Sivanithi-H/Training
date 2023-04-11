package vowelsOcc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnotherMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a[] = {'a','e','i','o','u'};
        int count = 0;

        int i, j;

        for (j = 0; j < a.length; j++) {
            int k = 0;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == a[j]) {
                    count++;
                    k++;
                }
            }
            if (k>0) {
                System.out.println("Occ of " + a[j] + " are :" + k);
            }else {
                System.out.println("No occarance occurs in this char :" +a[j]);
            }
        }
        if (count > 0) {
            System.out.println("occurance of vowels are :" + count);
        } else {
            System.out.println("No occurance found in this string :" +str);
        }
    }
}
