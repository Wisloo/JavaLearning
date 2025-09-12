package _12EnhancedSwitches;


import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        // Enhanced switch = a replacement to many else if statements
        //                   (Java14 Feature)
        // "->" means "do this code"
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter the day today: ");
        day = scanner.nextLine().toLowerCase(); // method chaining

        switch (day) {
            case "monday" , "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It's a weekday 💀");
            case "saturday", "sunday" ->
                    System.out.println("It's a weekend 😇");
            default ->
                    System.out.println(day + " is not a day");
        }
    }
}
