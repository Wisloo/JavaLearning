package _48ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Banana"); // add an element to the ArrayList
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Coconut");

        System.out.println("Array List: " + fruits);

        fruits.remove(0); // remove an element in the specific index of the ArrayList
        System.out.println("Remove at index 0: " + fruits);

        fruits.set(0, "Pineapple"); // we can set an index to a certain element
        System.out.println("Index 0 is now Pineapple.");
        System.out.println("Fruit at index 2: " + fruits.get(2)); // return element at specific index
        System.out.println("Array Size: " + fruits.size()); // checks the size of the ArrayList

        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
