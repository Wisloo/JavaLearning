package _4IfStatements;
import java.util.Objects;
import java.util.Scanner;

public class IfElseifElseStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        String name, isStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Are you a student? yes/no: ");
        isStudent = input.nextLine();

        // name
        if(name.isEmpty()) {
            System.out.println("You didn't enter any name (❁´◡`❁)");
        } else {
            System.out.println("Hello " + name + "!");
        }
        // age
        if(age >= 18 && age <= 39) {
            System.out.println("You are a young adult :-()");
        } else if (age < 0) {
            System.out.println("You are not born yet 🤐");
        } else if (age > 1 && age <= 17) {
            System.out.println("You are still a child 😶‍🌫️");
        } else if (age > 60) {
        System.out.println("You are a senior adult 👨‍🦳");
        } else {
            System.out.println("Invalid!");
        }
        // is the user a student?

        if(Objects.equals(isStudent, "yes")) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        input.close();
    }
}
