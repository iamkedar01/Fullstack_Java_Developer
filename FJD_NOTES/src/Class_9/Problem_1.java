package Class_9;
import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Enter Your Roll Number:");
        Scanner in = new Scanner(System.in);
        int RollNum = in.nextInt();

        System.out.println("Enter Your Name :");
        String Name = in.next();
        int total = 0;
        int[] marks = new int[3] ;
        for (int i=0; i<3;i++){
            System.out.println("Enter your marks: "+(i+1));
             marks[i] = in.nextInt();
            total = total + marks[i];
        }

        double avg = total /3;
        System.out.println("The total marks is :"+total);
        System.out.println("The Average marks is :"+avg);

    }
}