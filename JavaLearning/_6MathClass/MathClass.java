package _6MathClass;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Pi constant: " + Math.PI); // pi value
        System.out.println("Euler Constant: "  + Math.E); // exponential constant / euler's number

        double power, squareRoot, roundOff, ceilingMethod, floorMethod;
        int absoluteValue, maxMethod, minMethod;

        power = Math.pow(9, 10);

        /* math power operation

        Math.pow(number1, numberThatWillBeTheExponentOfNumber1);

        note that Math.pow uses double because, when raising a number, we are dealing with large values that include fractions
        hence the need to use double.
         */

        absoluteValue = Math.abs(-5);
        // this is an absolute value function
        squareRoot = Math.sqrt(9);
        // takes the squareroot of a number
        roundOff = Math.round(10.9826);
        // rounds off the number
        ceilingMethod = Math.ceil(3.14);
        // rounds the number "UP"
        floorMethod = Math.floor(89.75);
        // rounds the number "DOWN"
        maxMethod = Math.max(10, 20);
        // compares the numbers and see what is the max value
        minMethod = Math.min(85, 39);
        System.out.println("Power: " + power);
        System.out.println("Absolute value: " + absoluteValue);
        System.out.println("Squareroot: " + squareRoot);
        System.out.println("Rounded off number: " + roundOff);
        System.out.println("Ceiling Method: " + ceilingMethod);
        System.out.println("Floor Method: " + floorMethod);
        System.out.println("Max Value: " + maxMethod);
        System.out.println("Min Value: " + minMethod);

    }
}
