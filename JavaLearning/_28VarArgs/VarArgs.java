package _28VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        // VarArgs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 4)); // this will be packed into an array


        if (average(90, 90, 90, 50) > 70) {
            System.out.println("Congratulations, you passed");
        } else {
            System.out.println("You failed");
        }
    }
    static int add(int... numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // each index on the array is added to sum
        }
        return sum; // return the value of sum
    }
    static double average(double... numbers) {
        double sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum / numbers.length; // divides the total sum to the total number of elements in the array
    }
}
