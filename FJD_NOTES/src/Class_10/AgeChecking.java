package Class_10;
import java.util.Scanner;

public class AgeChecking {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age :");
        int age = in.nextInt();

        if(age >= 18){
            System.out.println("Your a Major Because Your age is :"+ age);
        }else if(age <0){
            System.out.println("You Entered the invalid  age " );
        }else{
            System.out.println("Your a Minor Because Your age is :" + age);
        }
    }
}
