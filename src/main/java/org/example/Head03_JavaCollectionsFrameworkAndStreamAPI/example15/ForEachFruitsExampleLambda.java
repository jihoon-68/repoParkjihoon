package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example15;

import java.util.Arrays;
import java.util.List;

public class ForEachFruitsExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .forEach(n -> System.out.println("Fruit: "+n));
                //.forEach(System.out::println);
    }
}
