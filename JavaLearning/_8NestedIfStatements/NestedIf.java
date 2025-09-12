package _8NestedIfStatements;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isStudent, isSenior;
        double price = 9.99, discount = 9.99;

        System.out.print("Are you a student? true/false: ");
        isStudent = input.nextBoolean();
        System.out.print("Are you a senior? true/false: ");
        isSenior = input.nextBoolean();

        if(isStudent) {
            if(isSenior) { // if both isStudent and isSenior are true
                System.out.println("You get a senior discount of 20%");
                System.out.println("and you also get a student discount of 10%");
                discount *= 0.30;
            } else { // if only isStudent is true
                System.out.println("You get a student discount of 10%");
                discount *= 0.10;
            }
            price -= discount; // price computation
        } else {
            if(isSenior) { // if only isSenior is true
                System.out.println("You get a senior discount of 20%");
                discount *= 0.20;
                price -= discount;
            } else { // none is true
                System.out.println("Unfortunately you don't have a discount");
                price *= 1;
            }
        }


        System.out.printf("The total price is $%.2f", price);

    }
}
