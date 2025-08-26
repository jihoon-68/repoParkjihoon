package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 4, 5, 10, 2);

        List<Integer> processed = numbers.stream()
                .filter(i-> i%2==0)
                .map(i-> i*i)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(processed);

    }
}
