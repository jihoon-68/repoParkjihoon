package org.example.Head04_JavaProgrammingStart.example7;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple", 1000);
        map.put("banana", 1500);
        map.put("apple", 1200);

        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("banana"));
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : map.keySet()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}
