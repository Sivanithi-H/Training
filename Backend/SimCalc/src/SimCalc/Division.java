package SimCalc;

public class Division extends CalcOper{
    private int value1;
    private int value2;
    private int result;

    public Division (int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void getDiv() {
        try {
            result = value1 / value2;
        } catch (ArithmeticException e) {
            System.out.println("Re Enter the number again");
        }
    }

    public void getResult() {
        System.out.println("Result : "+result);
    }
}
