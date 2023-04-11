import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        int count = 0;
        String alp ="";
        for(c = 'B'; c <= 'Z'; c+=2) {
            alp+= String.valueOf(c);
//            System.out.print(alp);
        }
//        String alp = "BDFHJLNPRTVXZ";
        System.out.print(alp);
        System.out.println("");
        String str = sc.nextLine().toUpperCase();
        System.out.println(str);

        for (int i = 0; i < alp.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == alp.charAt(i)) {
                    count++;
//                    System.out.println(count);
                }
            }
        }
        System.out.println(count);
//        if (count > 0) {
//            System.out.println("Occurance of even alphabets from a given string ( " +str + " ) :" + count);
//        } else {
//            System.out.println("No Occurance of even alphabets from a string :" +str);
//        }
//        }
    }
}