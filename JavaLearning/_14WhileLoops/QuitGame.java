package _14WhileLoops;

import java.util.Scanner;

public class QuitGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press q to quit: ");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("You have quitted the game");
    }
}
