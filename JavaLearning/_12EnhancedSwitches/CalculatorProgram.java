package _12EnhancedSwitches;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0); // to get char value

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' ->
                    result = num1 + num2;
            case '-' ->
                    result = num1 - num2;
            case '*' ->
                    result = num1 * num2;
            case '/' ->
                    {
                        if (num2 == 0) { // prevents "Infinity" from printing when dividing with zero
                            System.out.println("Math Error");
                            validOperation = false;
                        } else {
                            result = num1 / num2;
                        }
                    }
            case '^' ->
                    result = Math.pow(num1, num2);
            default -> {
                System.out.println(operator + " is not a valid operator");
                validOperation = false;
            }

        }
        if (validOperation) {
            System.out.println("The result is " + result);
        }

        scanner.close();
    }
}
