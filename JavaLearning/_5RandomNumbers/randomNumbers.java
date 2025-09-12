package _5RandomNumbers;
import java.util.Random; // Random class, much like the scanner class

public class randomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // object

        /* int number1 = random.nextInt(1, 7); // this will generate a random number
        int number2 = random.nextInt(1, 7); // this will generate a random number
        int number3 = random.nextInt(1, 7); // this will generate a random number


        to create a random number that has a limit, you need to have a parameter.
        example:
        every data type has a range

        int number = random.nextInt(param1, param2);

        the program will only give you a number in the parameters
        note: the first parameter is included in the set of numbers while the second parameter is not.

        System.out.println("The rolled dices are: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3); */

        boolean isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("The flipped coin is heads");
        } else {
            System.out.println("The flipped coin is tails");
        }

    }
}
