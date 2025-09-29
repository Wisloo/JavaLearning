package _59HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but Values can be duplicated
        //          Does not maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);
        System.out.println(map);

        map.remove("Apple");
        System.out.println(map);

        System.out.println(map.get("Coconut")); // passes a value
        System.out.println(map.containsKey("Banana")); // checks if there is a key

        if(map.containsKey("Banana")) {
            System.out.println(map.get("Banana"));
        } else {
            System.out.println("Not available.");
        }

        System.out.println(map.containsValue(1.00));
        System.out.println(map.size());

        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
