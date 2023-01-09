package calculator;

import java.util.Scanner;

public class calculator implements Test {

    Scanner sc = new Scanner(System.in);
    private int value1;
    private int value2;
    private int option;
    private char operation;
    private char[] operations = {'+', '-', '*', '/'};

    public void welcomeMessage() {
        System.out.println("Welcome.......");
    }

    public void showOption() {
        System.out.println("OPERATION :");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");

    }

    public void getOption() {
        System.out.println("Enter :");
        setOption(sc.nextInt());
        checkExceptionInOption();
    }

    public void setOption(int tempOption) {
        this.option = tempOption;
    }

    @Override
    public void checkExceptionInOption() {
        try {
            setOperation();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("RE-ENTER OPTION :");
            getOption();
        }
    }

    public void setOperation() {
        operation = operations[option - 1];
    }

    public void getNumbers() {
        System.out.println("Enter value1 : ");
        value1 = sc.nextInt();
        System.out.println("Enter value2 : ");
        value2 = sc.nextInt();
        FunCall();
    }

    public void FunCall() {
        System.out.println("Function Call :" + operation);
        switch (operation) {
            case '+':
                Addition add = new Addition(value1, value2);
                add.doOperation();
                add.printAns();
                break;
            case '-':
                Subtraction sub = new Subtraction(value1, value2);
                sub.doOperation();
                sub.printAns();
                break;
            case '*':
                Multiplication mul = new Multiplication(value1, value2);
                mul.doOperation();
                mul.printAns();
                break;
            case '/':
                Divition div = new Divition(value1, value2);
                div.checkExceptionOnNumbers();
                div.doOperation();
                div.printAns();
                break;

        }
    }

    @Override
    public void checkExceptionOnNumbers() {
    }

    public void doOperation() {
    }
}
