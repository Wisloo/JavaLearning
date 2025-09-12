package _11TernaryOperator;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temp, newTemp;
        String unit;

        System.out.print("Enter the temperature you want to convert: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); // only get the single character as opposed to nextLine who will get everything in the line
        // (condition) ? true : false

        newTemp = (unit.equals("C")) ? (temp * 1.8) + 32 : (temp - 32) / 1.8;

        System.out.printf("The converted temperature is %.2f°", newTemp);


        scanner.close();
    }
}
