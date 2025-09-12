package _2UserInput;

import java.util.Scanner;

public class CommonIssuesOfUserInput {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your favorite animal: ");
        String favAnimal = sc.nextLine();

        System.out.print("You are " + age + " years old");
        System.out.println("Your favorite animal is " + favAnimal + "which is nice! :> ");

        when you do this it will output:

        Enter your age: 12
        Enter your favorite animal: You are 12 years oldYour favorite animal is which is nice! :>
        because when ask input and the input is integer/double and then the next input is a string of text it will still
        have the new line character "\n". Basically you need to remove that new line input buffer so that it can handle the nextLine input for
        the String. Below is the right way to do it.
        */

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // you add a input.nextLine() and don't assign a value to it. This will consume that new line character
        System.out.print("Enter your favorite animal: ");
        String favAnimal = sc.nextLine();

        System.out.println("You are " + age + " years old");
        // println means that the next print will be below the previous.
        System.out.print("Your favorite animal is " + favAnimal + " which is nice! :> ");

        sc.close();
    }
}
