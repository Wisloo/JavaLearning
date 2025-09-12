package _4IfStatements;

import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        // Weight Conversion Program
        Scanner scanner = new Scanner(System.in);

        // declare variables
        double weight, newWeight;
        int choice;
        // prompt for user choice
        choice = scanner.nextInt();
        System.out.println("Enter weight: ");
        weight = scanner.nextDouble();

        // welcome message
        System.out.println("Hello, enter choice: (1 for kgs to lbs, 2 for lbs to kgs): ");

        // option 1 convert kgs to lbs
        if (choice == 1) {
            newWeight = weight * 2.20462;
            System.out.printf(weight + " kgs to lbs is %.2f lbs", newWeight);
        } else if(choice == 2) { // option 2 convert lbs to kgs
            newWeight = weight * 0.45359237;
            System.out.printf(weight + " lbs to kgs is %.2f kgs", newWeight);
        } else { // else print not a valid choice
            System.out.println("Not a valid choice");
        }

        scanner.close();
    }
}
