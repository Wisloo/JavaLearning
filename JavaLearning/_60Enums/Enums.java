package _60Enums;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();


        try{
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
                case SUNDAY, SATURDAY -> System.out.println("It is a weekend");
                case TUESDAY -> System.out.println("IT'S TACO TUESSSSSDAYYYYYYYY");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Please enter a valid day.");
        }
        scanner.close();
    }
}
