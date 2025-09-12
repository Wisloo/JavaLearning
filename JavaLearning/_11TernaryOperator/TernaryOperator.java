package _11TernaryOperator;



public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse
        // ternary operators are like simpler if else

        int score = 70;

        if (score >= 60) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }

        int score1 = 55;
        String passOrFail = (score1 >= 60) ? "Passed" : (score1 >= 50 || score1 <= 59) ? "Pasang awa" : "Failed";

        System.out.println(passOrFail);
    }
}
