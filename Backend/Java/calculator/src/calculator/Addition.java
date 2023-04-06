package calculator;

public class Addition extends CalOper {

    private int value1;
    private int value2;
    private int result;

    public Addition (int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void doOperation() {
        result = value1 + value2;
        System.out.println("Result: " +result);
    }
}
