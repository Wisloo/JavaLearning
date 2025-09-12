package _3ArithmeticOperators;
import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to buy? ");
        item = input.nextLine();
        System.out.print("Enter the price of the item (in dollars $): " );
        price = input.nextDouble();
        System.out.print("Enter the quantity of the item purchased: ");
        quantity = input.nextInt();

        double total = price * quantity;

        System.out.print("You purchased " + item + " ");
        System.out.println("the total price is " + currency + total);
        System.out.print("Please proceed to the counter, thank you!");


        input.close();
    }
}
