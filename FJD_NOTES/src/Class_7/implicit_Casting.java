package Class_7;

public class implicit_Casting {
    public static void main(String[] args) {
        // Implicit Casting means converting Lower datatype into a higher datatype
        // The java will support automatically
        // Here aware of the data type range that will help in the type casting
  /*  ---> Here the list of the 8 data type list
         --->    byte , short
         ---->   int , long
         ---->   float  , double
         ----->   char
         ----->   boolean

     Keyword must be written in the small letters
  *
  * */

    int n = 20;
    double d= n;
    float f = n;
    long l =n;
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);

     char c = 'A';
     int i = c;

        System.out.println(c);
        byte b = 35;
        double D = b;
        System.out.println(D);//35.0

    }
}
