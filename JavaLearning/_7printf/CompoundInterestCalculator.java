package _7printf;
import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Compound interest calculator

        double principal, rate, finalAmount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = input.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = input.nextInt();

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        finalAmount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The compound interest after " + years + " years is $%.2f", finalAmount);

        input.close();
    }
}
