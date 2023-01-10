package SimCalc;

public class Main {
    public static void main(String[] args) {
        CalcOper opr = new CalcOper();
        opr.printWelcome();
        opr.displayOperation();
        opr.getOption();
        opr.validOperation();
//        opr.setOperator();
        opr.setOption();
        opr.insertVal();
        opr.callOpera();
    }
}