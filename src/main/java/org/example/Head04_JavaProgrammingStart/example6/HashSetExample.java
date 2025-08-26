package org.example.Head04_JavaProgrammingStart.example6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("apple");
        System.out.println(hashSet.contains("banana")); // true
        System.out.println(hashSet.size());


    }
}
