package _2UserInput;

import java.util.Scanner; // this is a class that allows the programmer to ask for user input

public class UserInputTutorialJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner input = new Scanner(System.in); means that

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        // input.nextLine(); means you are asking for user input
        System.out.print("Enter your favorite number: ");
        int favNum = input.nextInt();
        // same with input.nextLine();, input.nextInt(); means you are asking for integer user input
        System.out.print("What is your GPA? ");
        double userGPA = input.nextDouble();
        // double means you are accepting a decimal value or a floating point value same with float
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();
        // boolean is a true or false variable

        System.out.println("Hello " + name + "!");
        System.out.println("Your favorite number is " + favNum);
        System.out.print("Your GPA is " + userGPA + " ");

        if(isStudent) {
            System.out.println("and you are a student");
        } else {
            System.out.println("and you are not a student");
        }
        // in an if statement, the program/ide already assumes that the condition is true

        input.close();
        // we close a scanner class to prevent it from memory leaks

    }
}