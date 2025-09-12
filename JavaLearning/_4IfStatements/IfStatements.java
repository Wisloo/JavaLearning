package _4IfStatements;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition is true

        int age = 69;
        // > greater than, < less than, >= greater than or equal to, <= less than or equal to, == equal to

        /*
        How to write if statements, else if, and else statements
        if (condition) {
        body of the if statement to be executed
        } else if (condition) {
        body of the else if statement to be executed
        } else {
        body of the else statement to be executed
        }
         */
        if(age <= 30) {
            System.out.println("You are cool!");
        } else if (age == 69){
            System.out.println("You are very sigma!");
        } else {
            System.out.println("You are great!");
        }

    }
}
