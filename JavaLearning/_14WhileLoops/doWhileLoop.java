package _14WhileLoops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        // do while = executes a code block while a certain condition is true.
        // makes sure at least one execution is executed.
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

         do { // the code block will execute first and then checks the condition
            System.out.println("There is no age less than 0");

            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);
    }
}
