package _25SimpleQuizGame;

import java.util.Scanner;

public class SimpleQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the correct way to declare a variable in Java?\n" +
                        "a) variable int x;\n" +
                        "b) int x = 5;\n" +
                        "c) x = 5;\n" +
                        "d) new int x;",
                "Which keyword is used to create a new object?\n" +
                        "a) class\n" +
                        "b) object\n" +
                        "c) new\n" +
                        "d) create",
                "Which data type is used for true/false values?\n" +
                        "a) string\n" +
                        "b) bool\n" +
                        "c) boolean\n" +
                        "d) flag",
                "What is the out of: System.out.println(10 % 3);\n" +
                        "a) 1\n" +
                        "b) 3\n" +
                        "c) 0\n" +
                        "d) 3.33"
        };
        String[] correctAnswer = {"b", "c", "c", "a"};
        String userAnswer;
        int totalPoints = 0, totalQuestions = questions.length;

        System.out.println("Hello! Welcome to Simple Java Quiz by Louis Antonio D. Lapayag!");
        System.out.println("Please answer with a, b, c, or d.");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer: ");
            userAnswer = scanner.nextLine();

            if(userAnswer.equalsIgnoreCase(correctAnswer[i])) {
                System.out.println("Correct!");
                totalPoints++;
            }
            else {
                System.out.println("Wrong!");
            }
        }
        double percentage = (double) totalPoints / totalQuestions * 100;
        System.out.println("Thank you for playing the game!");
        System.out.printf("Your score is %d/%d which is %.0f%%", totalPoints, totalQuestions, percentage);
        scanner.close();
    }
}
