package Class_10;
import java.util.Scanner;
public class BIgThreeTernary {
         public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Input three numbers
            System.out.print("Enter the First number: ");
            int num1 = in.nextInt();
            System.out.print("Enter the Second number: ");
            int num2 = in.nextInt();
            System.out.print("Enter the Third number: ");
            int num3 = in.nextInt();

            // Find the biggest using conditional (ternary) operator
             // condition ? value_if_true : value_if_false
             //  (num1 > num3 ? num1 : num3)
            int max = (num1 > num2) ? (num1 > num3 ? num1 : num3)
                    : (num2 > num3 ? num2 : num3);
            // Here  First check the condition true  Num1 > Num2 the again check the condition for Num1>Num3 after the ?  print the true condition like Num1 if flase print the num3
            // In the first condition Flase then check the Second condition in that first print the true value the print the false value

            // Display the result
            System.out.println("The Maximum number is: " + max);
        }
    }

