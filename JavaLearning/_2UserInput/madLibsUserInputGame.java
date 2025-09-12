package _2UserInput;

import java.util.Scanner;

public class madLibsUserInputGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.print("Enter an adjective (description/describing something): ");
        adjective1 = input.nextLine();
        System.out.print("Enter a noun (animal/person): ");
        noun1 = input.nextLine();
        System.out.print("Enter a second adjective (description/describing something): ");
        adjective2 = input.nextLine();
        System.out.print("Enter a verb (action word): ");
        verb1 = input.nextLine();
        System.out.print("Enter a third adjective (description/describing something): ");
        adjective3 = input.nextLine();

        System.out.println("Today I went to a/an " + adjective1 + " zoo. ");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3 + "!");


        input.close();

    }

}
