package com.priyanshi.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put(null, 3); // Allows null key
        map.put("cherry", null); // Allows null value

        System.out.println(map.get("apple")); // Output: 1
        System.out.println(map.get(null));     // Output: 3
    }
}
