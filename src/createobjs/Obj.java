package createobjs;

public class Obj {
    public Obj(String x) {
        System.out.println("printing " + x);
    }

    public void Obj(String x) {
        System.out.println("not a constructor");
    }
}

class A{
    public static void main(String[] args) {
        Obj obj = new Obj("text");
        obj.Obj("what?");
    }
}
