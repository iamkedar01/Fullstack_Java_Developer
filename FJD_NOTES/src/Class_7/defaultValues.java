package Class_7;

public class defaultValues {

    int k=0;
    boolean d=false;
    public static void main(String[] args) {

        // This are the goloable variable using object
        defaultValues obj = new defaultValues();

        System.out.println("\nDefault int: " + obj.k);
        System.out.println("Default boolean: " + obj.d);
        System.out.println("\n");


        // This are the Local variable  if we use the goloble variable must define the object before using it
        int a = 0;
        long l = 0L;
        byte b = 0;
        short s = 0;
        float f = 0.0f;
        double d = 0.0;
        boolean B = false;
        char c = ' '; // null character

        System.out.println("integer default value: " + a);
        System.out.println("long default value: " + l);
        System.out.println("byte default value: " + b);
        System.out.println("short default value: " + s);
        System.out.println("float default value: " + f);
        System.out.println("double default value: " + d);
        System.out.println("boolean default value: " + B);
        System.out.println("char default value: [" + c + "]");
    }
}


