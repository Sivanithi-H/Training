import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int a, b;
        int option;
        int result;
        System.out.println("Enter Option :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        option = sc.nextInt();
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        switch (option) {
            case 1 :
                result = a + b;
                System.out.println("Result : " +result);
                break;
            case 2 :
                result = a - b;
                System.out.println("Result : " +result);
                break;
            case 3 :
                result = a * b;
                System.out.println("Result : " +result);
            case 4 :
                try {
                    result = a / b;
                    System.out.println("Result : " +result);
                } catch (ArithmeticException e) {
                     System.out.println("ERROR : " +e.getMessage());
                }
        }
    }
}