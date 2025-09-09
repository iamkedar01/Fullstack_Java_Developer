package Class_9;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
     // Step 1 = read the values  from user or by default
     // step 2 = anlaysis the formula or the algorithem
     // step 3 = use possible shortcut method
     // step 4 display message
     Scanner in = new Scanner(System.in);
        System.out.println("Enter a Radius value:");
        int radius = in.nextInt();   // this for input valus
        float pi = 3.14f;



        double area = pi *radius *radius; // This is calculation part



        System.out.println("The area of the radius is :" + area); // This is Displaying partcd
    }
}
