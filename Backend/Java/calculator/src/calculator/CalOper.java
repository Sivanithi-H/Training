package calculator;

import java.util.Scanner;

public class CalOper {

    Scanner sc = new Scanner(System.in);
    private int a ;
    private int b ;
    private int option;
    private char operator;
    private char[] operations = {'+','-','*','/'};

    public void displayOption() {
        System.out.println("Select Operation :");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        option = sc.nextInt();
    }

    public void validOperation() {
        if( option < 5) {
            System.out.println("Valid operation");
        }else {
            System.out.println("Invalid operation");
            displayOption();
        }
    }

    public void setOperator() {
        operator = operations[option-1];
    }

    public void insertVal() {
        System.out.println("Enter a :");
        a = sc.nextInt();
        System.out.println("Enter b :");
        b = sc.nextInt();
    }

    public void calOperator() {
        switch (operator) {
            case '+' :
                Addition add = new Addition(a, b);
                add.doOperation();
                break;
            case '-' :
                Subtraction sub = new Subtraction(a, b);
                sub.doOperation();
                break;
            case '*':
                Multiplication mul = new Multiplication(a, b);
                mul.doOperation();
                break;
            case '/' :
                Division div = new Division(a, b);
                div.doOperation();
                break;
            default:
                System.out.println("Error");
        }
    }
}
