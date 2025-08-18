package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Consumer<Map.Entry<String, Integer>> consumer = new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> e) {
                System.out.println("key: "+e.getKey()+", Value : "+e.getValue());
            }
        };
        Stream<Map.Entry<String, Integer>> stream = scores.entrySet().stream();
        stream.forEach(consumer);
    }
}
