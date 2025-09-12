package _3ArithmeticOperators;

public class OrderOfOperations {
    public static void main(String[] args) {
        // Order of Operations [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;
        /* this is solved using PEMDAS, like real world, programming operators in java always does PEMDAS which means
           that the first thing the program starts doing when it sees an operation is to do the operation in the parenthesis
           then equation then multiplication, division, addition, and then subtraction.
         */

        System.out.println(result);
    }
}
