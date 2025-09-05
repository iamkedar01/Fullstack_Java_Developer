package Class_8;

public class logicalOpration {
    public static void main(String[] args) {
        System.out.println("\nLogical operation in java");
        /*  Logical Operators => && (AND), || (OR), ! (NOT)
	- used to join the conditions
*/
        int age = 18;
        if(age >=18 &&  age <= 60){
            System.out.println("Your an adult");
        } else if (age>=60 || age >=100) {
            System.out.println("Your a senior Citizen");
        }
        else{
            System.out.println("Your a child");
        }
    }
}
