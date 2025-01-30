package classmembers;

//public and class below are keywords
public class Animal {
    String name;
    //String class;
    //String public;

    public String getName() {
      return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int numberVisitors(int month) {
        return 10;
    }

    // in the above, method signature is
    // numberVisitors(int)

    /*
    multi line comment
     */

    /**
     * java doc comment
     */
}
