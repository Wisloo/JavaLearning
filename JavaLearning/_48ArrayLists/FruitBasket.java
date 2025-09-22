package _48ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        System.out.print("Enter # of fruits you would like: ");
        int numOfFruits = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFruits; i++) {
            System.out.printf("Enter fruit %d: ", i);
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }
        System.out.println(fruits);

        scanner.close();
    }
}
