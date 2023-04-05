import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        boolean flag = false;
        if (num == 0 || num == 1) {
            System.out.println(" " +num+" is PRIME NUMBER");
        }else  {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
//                flag = true;
//                break;
                    System.out.println(" " +num+ " is NOT PRIME NUMBER");
                    break;
                } else {
                    System.out.println(" " +num+ " is PRIME NUMBER");
                    break;
                }
            }
        }

//        if (!flag) {
//            System.out.println("Given number is prime");
//        } else {
//            System.out.println("Given number is not prime");
//        }
    }
}