package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cat", "Dog"),
                Arrays.asList("Egg")
        );

        List<String> flattened = nestedList.stream()
                .flatMap(List -> List.stream())
                .collect(Collectors.toList());

        System.out.println(flattened);
    }
}
