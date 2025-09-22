package _49Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        /* Exception = An event that interrupts the normal flow of a program
                   (Dividing by zero, file not found, mismatch input type)
                   Surround any dangerous code with a try{} block
                   try{}, catch{}, finally {} */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally { // always execute. use for cleaning up resources
            scanner.close();
        }
    }
}
