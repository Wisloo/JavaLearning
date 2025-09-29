package _58Generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        // that is compatible with different data types.
        // <T> or (T, U, V, etc.) type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>(); // you don't need to type the data type again in the second diamond operator
        ArrayList<Integer> numbers = new ArrayList<>(); // you don't need to type the data type again in the second diamond operator

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Box<String> box = new Box<>();

        box.setItem("Banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Pizza", 3.14);
        Product<String, Integer> product2 = new Product<>("Ticket", 15);

        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());


    }
}
