package _13LogicalOperators;

import java.util.Scanner;

public class UsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Invalid Username. Should be 4-12 characters long");
        } else {
            System.out.println("Hello " + username);
        }
    }
}
