package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example35;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Kang", "Choi", "Cha");

        Map<Character, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(map);
    }
}
