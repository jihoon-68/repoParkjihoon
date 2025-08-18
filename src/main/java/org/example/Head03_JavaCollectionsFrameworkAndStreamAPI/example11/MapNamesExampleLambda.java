package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example11;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .map(name -> name.length())
                .forEach(lieght -> System.out.println(lieght));
    }
}
