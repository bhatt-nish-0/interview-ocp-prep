package packageandimportsfurther.third;
import packageandimportsfurther.first.*;
import packageandimportsfurther.second.First;
import java.lang.System;
//above is a redundant import
public class Main {
    public static void main(String[] args) {
        First f = new First();
        f.doSomething();

        Third third = new Third();
        third.soSoemthingThird();

        Fourth fourth = new Fourth();
        String x1 = fourth.x();
        System.out.println(x1);
    }
}
