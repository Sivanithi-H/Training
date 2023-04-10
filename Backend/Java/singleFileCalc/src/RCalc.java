import java.util.Scanner;

public class RCalc {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean con = true;
        while (con) {
            int result = 0;
            con = false;
            System.out.println("Enter Option :" );
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            option = sc.nextInt();

            if (option == 1 || option == 2 || option == 3 || option == 4) {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                if (option == 1) {
                    result = a + b;
//                    con = false;
                }
                if (option == 2) {
                    result = a - b;
//                    con = false;
                }
                if (option == 3) {
                    result = a * b;
//                    con = false;
                }
                if (option == 4) {
                    try {
                        result = a / b;
//                        con = false;
                    }catch (ArithmeticException e) {
                        System.out.println("Error : " + e.getMessage());
                        con = true;
                    }
                }
            }else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Result : " +result);
        }
    }
}
