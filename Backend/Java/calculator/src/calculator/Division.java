package calculator;

public class Division extends CalOper {

    private int value1;
    private int value2;
    private int result;

    public Division (int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void doOperation() {
        try {
            result = value1 / value2;
            System.out.println("Result : " +result);
        }catch(ArithmeticException e) {
            System.out.println("Division by zero");
            insertVal();
        }
    }
}
