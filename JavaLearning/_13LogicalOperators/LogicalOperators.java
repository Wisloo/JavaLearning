package _13LogicalOperators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        Scanner scanner = new Scanner(System.in);
        double temp;
        boolean isSunny = false;
        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        if(temp <= 30 && temp >= 0 && isSunny) { // if all are true then execute code block
            System.out.println("The weather is good ☺️");
            System.out.println("It is sunny outside ☀️");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good ☺️");
            System.out.println("It is cloudy outside ☁️");
        } else if (temp > 30 || temp < 0) { // at least one condition is true
            System.out.println("The weather is bad 💀");
        }

        scanner.close();
    }
}
