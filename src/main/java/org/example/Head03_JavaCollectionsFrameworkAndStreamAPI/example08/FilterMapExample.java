package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example08;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 75);
        scores.put("Park", 88);

        Predicate<Map.Entry<String,Integer>> highScore = new Predicate<Map.Entry<String,Integer>>() {
            @Override
            public boolean test(Map.Entry<String,Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        scores.entrySet()
                .stream()
                .filter(highScore)
                .forEach(System.out::println);

    }
}
