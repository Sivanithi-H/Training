package calculator;

public class Subtraction extends CalOper{

    private int value1;
    private int value2;
    private int result;

    public Subtraction (int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void doOperation() {
        result = value1 - value2;
        System.out.println("Result : " +result);
    }
}
