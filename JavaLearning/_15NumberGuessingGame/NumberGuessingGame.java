package _15NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, min = 1 , max = 100, attempts = 0, randomNumber = random.nextInt(min,max + 1);

        System.out.println("-----------Number Guessing Game-----------");
        System.out.printf("Guess a number between %d to %d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high! try again");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("Attempts: " + attempts);
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
