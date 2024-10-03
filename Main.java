package com.priyanshi.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Priyanshi", 94);
        map.put("Aman", 88);
        map.put("Raj", 92);

        System.out.println(map.get("Raj"));
        System.out.println(map.getOrDefault("Charu",78 ));
        System.out.println(map.containsKey("Priyanshi"));
        System.out.println(map.keySet());

        HashSet<Integer> set = new HashSet<>();
        set.add(24);
        set.add(56);
        set.add(31);
        set.add(9);
        set.add(56); // no duplicates: will only have 56 once
        set.add(18);

        System.out.println("HashSet: " + set);

        TreeMap<String, Integer> map2 = new TreeMap<>();

        map2.put("Priyanshi", 94);
        map2.put("Aman", 88);
        map2.put("Raj", 92);

        System.out.println("TreeMap keys: " + map2.keySet()); // stores keys in SORTED order
        System.out.println("TreeMap values: " + map2.values());
        System.out.println("TreeMap keys in descending order: " + map2.descendingKeySet());
    }
}
