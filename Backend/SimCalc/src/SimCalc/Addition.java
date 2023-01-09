package SimCalc;

public class Addition extends CalcOper{
    private int value1;
    private int value2;
    public int result;

    public void Addition (int value1,int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    protected void getAdd() {
        result = value1 + value2;
    }

    protected void getResult() {
        System.out.println("Result : "+ result);
    }
}
