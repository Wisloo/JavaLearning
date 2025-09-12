package _14WhileLoops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()) { // it will prompt user input if name is still empty
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        int age;


        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("There is no age less than 0");

            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
