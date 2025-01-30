package instanceinitblocks;

public class InstanceInit {

    {
        System.out.println("snowhy palowy");
        name = "mamooty";
    }
    private String name = "alex";
    // above is instance initializer - cant exist in methods

    //order of init
    // fields and instance init run in order
    // constructor runs last
    //
    public InstanceInit() {
        System.out.println("running constr!");
        //name = "jim";
    }

    public void printNAme() {
        System.out.println(name);
    }
}

class A {
    public static void main(String[] args) {
        InstanceInit instanceInit = new InstanceInit();
        instanceInit.printNAme();
    }
}
