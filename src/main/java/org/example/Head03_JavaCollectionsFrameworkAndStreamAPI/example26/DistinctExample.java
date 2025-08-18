package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example26;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public  static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Kim", "Park", "Lee");

        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
