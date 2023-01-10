package SimCalc;

public class Multiplication extends CalcOpera {
    private int value1;
    private int value2;
    private int result;

    public Multiplication (int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void getMul() {
        result = value1 * value2;
    }

    public void getResult() {
        System.out.println("Result : "+result);
    }
}
