package SimCalc;

public class Main {
    public static void main(String[] args) {
        CalcOpera opr = new CalcOpera();
        opr.printWelcome();
        opr.displayOperation();
        opr.validOperation();
        opr.setOperator();
        opr.insertVal();
        opr.callOpera();
    }
}
