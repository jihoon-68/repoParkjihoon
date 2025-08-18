package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example27;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 9);
        List<String> cities = Arrays.asList("Seoul", "Busan", "New York", "London");

        numbers.stream()
                //.sorted()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);

        cities.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
