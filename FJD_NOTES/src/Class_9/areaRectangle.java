package Class_9;
import java.util.Scanner;
public class areaRectangle {
    public static void main (String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length :" );
        int length = in.nextInt();
        System.out.println("Enter a the width:");
        int width = in.nextInt();

        float AreaRec = ( length  * width );
        System.out.println("The Area of Rectangle is : " + AreaRec);

    }
}
