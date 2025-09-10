package Class_10;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even number ");
        }else{
            System.out.println("The number is odd number");
        }

    }
}



