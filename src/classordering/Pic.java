package classordering;

import java.util.Arrays;
public class Pic {

    private String[] arr;

    public void soSomething() {
        this.arr = new String[3];
        arr[0] = "first";
        arr[1] = "two";
        arr[2] = "last";
    }

    public void print() {
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public String name= "meerkat";
}

class D{
    public static void main(String[] args) {
        Pic p = new Pic();
        p.soSomething();
        p.print();
        System.out.println(p.name);
    }
}
