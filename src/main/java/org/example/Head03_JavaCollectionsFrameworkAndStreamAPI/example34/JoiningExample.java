package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println("Formatted result: " + result);
    }
}
