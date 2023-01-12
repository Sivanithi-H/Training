package calculator;

public class Division extends calculator {
    private int value1;
    private int value2;
    private int result;

    public Division(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public void checkExceptionOnNumbers() {
        try {
            doOperation();
            System.out.println(value1 + "/" +value2);
        } catch(ArithmeticException e) {
            System.out.println("Division by zero" );
            super.setOption(4);
            super.setOperation();
            super.getNumbers();

        }
    }
    public void doOperation() {
        int result = value1 / value2;
    }
    public void printAns() {
        System.out.println("Ans :" + result);
    }
}
