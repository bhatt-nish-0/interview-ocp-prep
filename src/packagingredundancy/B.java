package packagingredundancy;

//import packagingredundancy.A;

import java.sql.Date;

public class B {
    public static void main(String[] args) {
        A a = new A();
        //no need to import A because it is in the same package
        System.out.println(a.x());

        java.sql.Date d;
        java.util.Date d1;

    }
}
