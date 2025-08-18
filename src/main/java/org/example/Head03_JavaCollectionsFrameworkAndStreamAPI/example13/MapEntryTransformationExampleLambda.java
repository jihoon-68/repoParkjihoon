package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example13;

import java.util.HashMap;
import java.util.Map;

public class MapEntryTransformationExampleLambda
{
    public static void main(String[] args)
    {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        scores.entrySet().stream()
                .map(entry -> entry.getKey() +" : "+entry.getValue())
                .forEach(System.out::println);
    }
}
