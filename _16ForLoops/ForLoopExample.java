package _16ForLoops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.print(i + " ");
        }


        scanner.close();
    }
}
