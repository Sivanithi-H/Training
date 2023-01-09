package SimCalc;

import java.util.Scanner;

public class CalcOper {
    Scanner sc = new Scanner(System.in);
    private int value1;
    private int value2;
    private int option;
    private int operator;
//    private char[] operations = {'+','-','*','/'};
    public void printWelcome() {
        System.out.println("WELCOME....");
    }

    public void option() {
        System.out.println("Select Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divition");
        option = sc.nextInt();
    }
    public void InsertVal() {
        System.out.println("Enter value1:");
        value1 = sc.nextInt();
        System.out.println("Enter value2");
        value2 = sc.nextInt();
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
            System.out.println("INVALID");
            option();
        }
    }

    public void callOper() {
        if(option<5) {
            switch (option) {
                case 1:
                    Addition add = new Addition();
                    add.getAdd();
                    add.getResult();
                case 2:
                    Subtraction sub = new Subtraction();
                    sub.getSub();
                    sub.getResult();
                case 3:
                    Multiplication mul = new Multiplication();
                    mul.getMul();
                    mul.getResult();
                case 4:
                    Divition div = new Divition();
                    div.getDiv();
                    div.getResult();
            }
        }
    }
}
