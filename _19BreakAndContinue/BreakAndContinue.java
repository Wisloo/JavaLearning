package _19BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 1; i < 10; i++) {

            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
