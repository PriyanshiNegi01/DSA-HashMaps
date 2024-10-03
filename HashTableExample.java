package com.priyanshi.HashMap;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("apple", 1);
        table.put("banana", 2);
        // table.put(null, 3); // Throws NullPointerException
        // table.put("cherry", null); // Throws NullPointerException

        System.out.println(table.get("apple")); // Output: 1
    }
}
