package Class_10;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BigThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int Num1 = in.nextInt();
        System.out.print("Enter the Second Number:");
        int Num2 = in.nextInt();
        System.out.print("Enter the Third Number:");
        int Num3 = in.nextInt();
// This is the one diffrent method to find the max of three number
//        int max = Num1;
//        if(Num2>max){
//            max = Num2;
//            System.out.print("The Maximum number is:"+ max) ;
//        }else if (Num3>max){
//            max = Num3;
//            System.out.print("The Maximum number is: " + max);
//        }else{
//            System.out.println("The Maximum Number is : "+ max);
//        }
        if(Num1 > Num2 && Num1 > Num3){
            System.out.println("The Maximum Number is :" + Num1);
        } else if (Num2>Num1 && Num2>Num3) {
            System.out.println("The maximum number is : "+ Num2);
        } else{
            System.out.println("The maximum number is :"+ Num3);
        }
    }
}
