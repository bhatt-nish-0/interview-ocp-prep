package literals;

public class Literals {
    public static void main(String[] args) {
        long max = 23;
        //above is ok because int can fit into long

        //long max2 = 10000000000;
        // above is not ok because 10000000000 cannot fit into an int

        long max3 = 10000000000L;
        //above is ok because 10000000000 can fit into a long and is a LONG!

        int i = 017;
        int i1 = 0xFF;
        int i2 = 0b10;

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);

        double d = 222222.3333333;
        d = 22_2222.33_3333;

        //underscore cant be at the start
        //underscore cant be at the end
        //underscore cant be before a decimal point
        //underscore cant be after a decimal point

        double x = 1____9;
        System.out.println(x);
    }
}
