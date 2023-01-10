package SimCalc;

import java.util.Scanner;

public class CalcOper {
    Scanner sc = new Scanner(System.in);
    private int value1;
    private int value2;

    private int option;

    private char operator;
    private char[] operations = {'+','-','*','/'};
    public void printWelcome() {
        System.out.println("WELCOME....");          //Print Welcome
    }
    public void displayOperation() {                //Choose operations
        System.out.println("Select Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        option = sc.nextInt();                      //Get option value
    }

    public void validOperation() {                //Given operation valid or Error
         if ( option < 5 ) {
            System.out.println("Valid Operation");
        } else {
             System.out.println("Error");
             displayOperation();
         }
    }

    public void setOperator() {
       operator = operations[option -1];
    }
    public void insertVal() {                      //get an input of value1 and value2
        System.out.println("Enter value1 :");
        value1 = sc.nextInt();
        System.out.println("Enter value2 :");
        value2 = sc.nextInt();
    }

    public void callOpera() {                   //Do and Call subclass operations
        switch (operator) {
            case '+':
                Addition add = new Addition(value1, value2);
                add.getAdd();
                add.getResult();
                break;
            case '-':
                Subtraction sub = new Subtraction(value1, value2);
                sub.getSub();
                sub.getResult();
                break;
            case '*':
                Multiplication mul = new Multiplication(value1, value2);
                mul.getMul();
                mul.getResult();
                break;
            case '/':
                Division div = new Division(value1, value2);
                div.getDiv();
                div.getResult();
                break;
            default:
                System.out.println("INVALID OPERATOR");
                break;
        }
    }
}
