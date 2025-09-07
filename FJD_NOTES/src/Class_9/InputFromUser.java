package Class_9;

import java.util.Scanner;
public class InputFromUser {
        public static void main(String[] args) {
            System.out.println("\nScanner Class in Java...!");
        /*  nextInt() => used to read an int value
            - nextLong() => used to read a long value
           - nextFloat() => used to read a float value
            - nextDouble() => used to read a double value
            - next() => used to read a String value without spaces
            - nextLine() => used to read a String value with spaces


        * */

           Scanner in = new Scanner(System.in);
            System.out.print("Enter a number ");
            int num = in.nextInt();
            System.out.println("The number is "+ num);

            System.out.print("Enter a Float number");
            float f = in.nextFloat();
            System.out.println("The float number:"+ f);

            System.out.print("Enter a  String :");
            String str1 = in.next();
            System.out.println("The String  is :" + str1);

            System.out.print("Enter a  String :");
            String str2 = in.nextLine();
            System.out.println(" The String  is :" + str2);



        }
    }

