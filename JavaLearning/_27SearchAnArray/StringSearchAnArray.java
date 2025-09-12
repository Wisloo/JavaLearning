package _27SearchAnArray;

import java.util.Scanner;

public class StringSearchAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"orange", "banana", "apple", "grapes"};
        System.out.println("Enter fruit to find:");
        String target = scanner.nextLine().toLowerCase();
        boolean isFound = true;

        for(int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index " + i);
                isFound = true;
            }
        }
        if(!isFound) {
            System.out.println("Element not found!");
        }
        scanner.close();
    }
}
