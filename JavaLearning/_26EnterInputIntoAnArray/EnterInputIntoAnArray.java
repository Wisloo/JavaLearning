package _26EnterInputIntoAnArray;

import java.util.Scanner;

public class EnterInputIntoAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of food: ");
        int foodNum = scanner.nextInt();
        scanner.nextLine(); // input buffer for int and string
        String[] foods = new String[foodNum]; // creating an empty array with a space of 3 elements

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter food: ");
            foods[i] = scanner.nextLine(); // take in input
        }

        for(String food : foods) {
            System.out.print(food + " ");
        }
        scanner.close();
    }
}
