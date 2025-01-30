package wrappers;

public class A {
    public static void main(String[] args) {
        int r = Integer.parseInt("123");
        Integer r1  = Integer.valueOf("123");

        System.out.println(r1.intValue());

        Integer k = 2000;
        byte t = k.byteValue();
        System.out.println(t);

        int max = Integer.max(2, 3);

        System.out.println(max);
    }
}
