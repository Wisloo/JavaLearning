package _24Arrays;
import java.util.Arrays;
public class ArraysInJava {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         think of it as a variable that can store more than one value.

        String[] fruits = {"apple", "banana", "mango", "grapes"}; // [] = array
        // length is 4 but indices is 3 because we start at 0. So 0, 1, 2, 3 which makes the length 4
        // fruits [0] = "coconut";
        // Arrays.sort(fruits); arrange arrays in java
        Arrays.fill(fruits, "Pineapple");

        System.out.println(fruits[1]);
        int numOfFruits = fruits.length; // if you ever need the element of the array
        System.out.println(numOfFruits);
        for(int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        for(int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        for(String fruit : fruits) { // enhanced for loop
            System.out.print(fruit + " ");
        }

    }
}
