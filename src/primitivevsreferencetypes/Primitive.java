package primitivevsreferencetypes;

public class Primitive {
    public static void main(String[] args) {
        boolean a=  true;
        byte b = -128;
        short s = -32768;
        int i = -2147483648;
        long l = -1000L;
        float f = -2.87654F;
        double d = -2.87654;
        char c = 'c';

        String x = "nischal";
        System.out.println(x.length());

        //String is an object, not a primitve type

        s = 32767;
        s = -32768;

        c = 65535;

        //short and char are same size
        // but char cannot take negative values!

    }
}
