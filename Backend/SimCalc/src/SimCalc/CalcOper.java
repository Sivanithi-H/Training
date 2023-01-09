package SimCalc;

import java.util.Scanner;

public class CalcOper {
    Scanner sc = new Scanner(System.in);
    private double value1;
    private double value2;
    private int option;
    private int operator;
    private char[] operations = {'+','-','*','/'};
    public void printWelcome() {
        System.out.println("WELCOME....");
    }

    public void option() {
        System.out.println("Select Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        option = sc.nextInt();
    }
    public void InsertVal() {
        System.out.println("Enter value1:");
        value1 = sc.nextDouble();
        System.out.println("Enter value2");
        value2 = sc.nextDouble();
    }

    public void validOperation() {
        if (option==1) {
            System.out.println("VALID");
        } else if (option==2) {
            System.out.println("VALID");
        } else if (option==3) {
            System.out.println("VALID");
        } else if (option==4) {
            System.out.println("VALID");
        } else if (option>4) {
            System.out.println("ERROR");
        }
    }

//    public void setOperator() {
//       operator = operations[option - 1];
//    }
    public void setOption() {
        this.option = option - 1;
    }

    public void callOpera() {
            switch (option) {
                case 0:
                    Addition add = new Addition();
                    add.getAdd();
                    add.getResult();
                    break;
                case 1:
                    Subtraction sub = new Subtraction();
                    sub.getSub();
                    sub.getResult();
                    break;
                case 2:
                    Multiplication mul = new Multiplication();
                    mul.getMul();
                    mul.getResult();
                    break;
                case 3:
                    Division div = new Division();
                    div.getDiv();
                    div.getResult();
                    break;
                default:
                    System.out.println("INVALID OPERATOR");
                    break;
            }
            sc.close();
    }

}
