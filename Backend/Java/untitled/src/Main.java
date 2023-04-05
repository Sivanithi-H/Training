import Occurance.AnotherWaySingleChar;
import Occurance.SingleChar;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        SingleChar occ = new SingleChar();
        occ.method();

        AnotherWaySingleChar occ2 = new AnotherWaySingleChar();
        occ2.method2();
    }
}