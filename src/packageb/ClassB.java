package packageb;
import packagea.ClassA;
public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}

//javac -d aramdayak packageb\ClassB.java
//java -cp aramdayak packageb.ClassB
//in the above java now knows where to find the classes!
//in the above, the compiled classes will be placed in aramdayak folder
// javac packageb/ClassB.java run from src folder
