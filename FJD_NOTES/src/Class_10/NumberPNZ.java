package Class_10;
import java.util.Scanner;

public class NumberPNZ {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num > 0){
            System.out.println("The number is Positive:" + num);
        }else if (num < 0){
            System.out.println("The number is Negative:" + num);
        }else{
            System.out.println("The number is Zero "+ num);
        }
    }
}
