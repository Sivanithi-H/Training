package calculator;

public class Subtraction extends calculator {
    private int value1;
    private int value2;
    private int result;
    public Subtraction(int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public void doOperation() {
        result = value1 - value2;
    }
    public void printAns() {
        System.out.println("Ans :"+result);
    }
}
