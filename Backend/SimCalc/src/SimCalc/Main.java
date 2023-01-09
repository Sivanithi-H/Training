package SimCalc;

public class Main {
    public static void main(String[] args) {
        CalcOper opr = new CalcOper();
        opr.printWelcome();
        opr.option();
        opr.validOperation();
//        opr.setOperator();
        opr.setOption();
        opr.InsertVal();
        opr.callOpera();
    }
}