package _30SlotMachineGame;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerBalance = 100;
        int playerBet = 0;
        int payOut = 0;
        char ans;
        String[] symbol = {"bell", "smoke", "crown", "leopard", "witch"};

        while(playerBalance >= 1) {
            System.out.println("Your balance is " + playerBalance);
            System.out.print("How much do you want to bet? (Enter amount): ");
            playerBet = scanner.nextInt();

            if(playerBet > playerBalance) {
                System.out.println("Not enough credits");
                continue;
            }
            playerBalance -= playerBet;

            System.out.println("Take your chances!");
            // generate a random number that would then signify an element in the array
            String reel1 = symbol[random.nextInt(symbol.length)];
            String reel2 = symbol[random.nextInt(symbol.length)];
            String reel3 = symbol[random.nextInt(symbol.length)];

            System.out.println(reel1 + " | " + reel2 + " | " + reel3);

            // check winnings
            if (reel1.equals(reel2) && reel1.equals(reel3)) { // check if reel1 is equal to reel2 and reel3
                payOut = playerBet * 5;
                playerBalance += payOut;
                System.out.println("JACKPOT! You won payout! x5");
            } else if (reel1.equals(reel2) || reel1.equals(reel3) || reel2.equals(reel3)) {
                payOut = playerBet * 2;
                playerBalance += payOut;
                System.out.println("You won payout x2!");
            } else {
                System.out.println("Sorry, you lost.");
            }

            System.out.println("Do you want to play again? (y/n): ");
            ans = scanner.next().charAt(0);

            if(ans == 'n') {
                System.out.println("Thank you for playing!");
                break;
            }
        }
        System.out.println("Game Over! Final balance: " + playerBalance);
    }
}
