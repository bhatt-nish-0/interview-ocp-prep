package packageandimport.random;

import java.util.Random;
//package name start with java means it came with the jdk
// tells the program which package to look in for
//already defined classes!
public class Example {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
