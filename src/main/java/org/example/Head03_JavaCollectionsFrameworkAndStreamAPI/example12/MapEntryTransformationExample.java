package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example12;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample
{
    public static void main(String[] args)
    {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Function<Map.Entry<String, Integer>, String> highScoreFunction = new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> e) {
                return e.getKey()+" : " + e.getValue();
            }
        };

        scores.entrySet()
                .stream()
                .map(highScoreFunction)
                .forEach(System.out::println);

    }
}
