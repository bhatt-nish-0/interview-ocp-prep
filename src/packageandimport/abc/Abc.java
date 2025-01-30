package packageandimport.abc;

import packageandimport.rod.StaticImportExample;

import static packageandimport.rod.StaticImportExample.*;

public class Abc {
    public static void main(String[] args) {
        d();
        StaticImportExample.d();
    }
}
