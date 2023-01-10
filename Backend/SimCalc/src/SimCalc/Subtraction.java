package SimCalc;

public class Subtraction extends CalcOpera {
    private int value1;
    private int value2;
    private int result;

    public Subtraction (int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void getSub() {
        result = value1 - value2;
    }

    public void getResult() {
        System.out.println("Result : "+result);
    }
}
