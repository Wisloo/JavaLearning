package _2UserInput;

import java.util.Scanner;

public class CalculateTheAreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double Area = base * height / 1/2;

        System.out.print("The area of the triangle is: " + Area + " cm²");

        input.close();
    }
}
