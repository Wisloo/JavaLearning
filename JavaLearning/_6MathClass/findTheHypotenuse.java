package _6MathClass;
import java.util.Scanner;

public class findTheHypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // find the hypotenuse
        /* double opp, adj, hyp, oppPow, adjPow;

         System.out.print("Enter opposite: ");
        opp = input.nextDouble();
        System.out.print("Enter adjacent: ");
        adj = input.nextDouble();
        oppPow = Math.pow(opp, 2);
        adjPow = Math.pow(adj, 2);


        hyp = Math.sqrt(oppPow + adjPow);

        System.out.println("The hypotenuse is: " + hyp);

        consequently, you can do it like below
        */

        double opp, adj, hyp;
        System.out.print("Enter opposite: ");
        opp = input.nextDouble();
        System.out.print("Enter adjacent: ");
        adj = input.nextDouble();



        hyp = Math.sqrt(Math.pow(opp, 2) + Math.pow(adj, 2));

        System.out.println("The hypotenuse is: " + hyp);

        input.close();
    }
}
