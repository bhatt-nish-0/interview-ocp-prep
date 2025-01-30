package reftypesandobjs;

public class A {
    public static void main(String[] args) {

        Art a = new Art();
        Art b = new Art();
        a.print();
        b.print();
        System.out.println(a == b);

        b = a;

        System.out.println(a == b);

        int y = 23;
        //y.print(); primitives have no methods
    }
}

class Art {

    public void print() {
        System.out.println("test");
    }
}
