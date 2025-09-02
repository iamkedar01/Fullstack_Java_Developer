package Class_7;

public class explicit_Casting {
    public static void main(String[] args) {
        // Converting higher data type into lower data type

        long x = 100; //  int n = x;//error
        int n = (int)x;
        System.out.println(n);//100

        double d = 45.5; //short s = d;//error
        short s = (short)d; // Here aware of  the writeing the d when you use the double
        System.out.println(s);//45

        int N = 65; // char c = n;//error
        char c = (char) N;
        System.out.println(c);//A


       //  float f = 3.14;//error - since in Java a value with decimal point is double data type
        float f = (float)3.14;
        // float f = 3.14f; // here the three diffrent way of writeing the float datatype
        // float f = 3.14F;
        System.out.println(f);



    }
}
