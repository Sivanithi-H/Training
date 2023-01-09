package SimCalc;

public class Addition extends CalcOper{
    private int value1;
    private int value2;
    private int result;

    public void Addition (int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public void getAdd() {
        result = value1 + value2;
    }

    public void getResult() {
        System.out.println("Result : "+result);
    }
}
