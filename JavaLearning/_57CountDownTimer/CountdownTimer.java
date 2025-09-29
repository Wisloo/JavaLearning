package _57CountDownTimer;


import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response;
        System.out.print("Enter number of seconds to countdown from: ");
        response = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task= new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0) {
                    System.out.println("Happy Birthday My Dude!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
