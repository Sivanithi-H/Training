package SimCalc;

public class Addition extends CalcOpera {
    private int a;
    private int b;
    private int result;

    public Addition (int a,int b) {
        this.a = a;
        this.b = b;
    }
    protected void getAdd() {
        result = a  + b;
    }

    protected void getResult() {
        System.out.println("Result : "+ result);
    }
}
