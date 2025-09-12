package Class_10;
import java.util.Scanner;
public class PriceDisCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the item number:");
        int ItemNo = in.nextInt();
        System.out.print("Enter the item Name: ");
        String Itemname = in.next();
        System.out.print("Enter the rate of the item(Discount for only above 1000): ");
        int itemrate = in.nextInt();
        System.out.print("Enter the quanatity of the item :");
        int itemquantiy = in.nextInt();

        float price = itemrate * itemquantiy;
        float discount =0f;
        float DisPrice = 0f;

        if (price >= 1000 && price  < 2000){
            System.out.println("The price of the item is :" +price);
            System.out.println("discount is 10% on price");
               discount = 0.01f * price; // note when you useing the float value must give the 0.01f  "f" must be written
               DisPrice = price - discount;
            System.out.println("The total Discout price is :"+DisPrice);
        }
    	else if (price >= 2000 && price < 3000){
            System.out.println("The price of the item is :" +price);
            System.out.println("discount is 15% on price");
            discount = 0.01f * price; // note when you useing the float value must give the 0.01f  "f" must be written
            DisPrice = price - discount;
            System.out.println("The total Discout price is :"+DisPrice);
        }
	    else if (price >= 3000 && price < 5000){
            System.out.println("The price of the item is :" +price);
            System.out.println("discount is 20% on price");
            discount = 0.01f * price; // note when you useing the float value must give the 0.01f  "f" must be written
            DisPrice = price - discount;
            System.out.println("The total Discout price is :"+DisPrice);

        }else if (price >= 5000){
            System.out.println("The price of the item is :" +price);
            System.out.println("discount is 25% on price");
            discount = 0.01f * price; // note when you useing the float value must give the 0.01f  "f" must be written
            DisPrice = price - discount;
            System.out.println("The total Discout price is :"+DisPrice);
        }
    }
}
