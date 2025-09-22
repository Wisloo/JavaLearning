package _43RuntimePolymorphism;

import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism = when the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);
        Animal animal; // declare an object but not instantiate

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog(); // instantiate the object
            animal.Speak(); // animal is now a dog so it will use the dog method of speak
        } else if (choice == 2) {
            animal = new Cat();
            animal.Speak(); // animal is now cat so it will use the cat method to speak
        } else {
            System.out.println("Not a valid number!");
        }


    }
}
