package _3ArithmeticOperators;

public class AugmentedArithmeticOperators {
    public static void main(String[] args) {
        // Augmented Arithmetic Operators
        int x = 10, y = 3;

       /*  x += y;  this is the same is x = x + y
        x -= y;  same as x = x - y
        x /= y;  same as x = x / y
        x *= y;  same as x = x * y
        x %= y;  same as x = x % y
        (all of these are ways to use arithmetic operators to store it in a variable)
        */

        x *= y;

        System.out.println(x);
        // now this "int x" variable will hold a value of 30 and will remain 30 until it is used with any operators again.

        y += x;

        System.out.println(y);
        /* notice at the top that x is equal to 10? since we use an augmented arithmetic operator it has a new value  */
    }
}
