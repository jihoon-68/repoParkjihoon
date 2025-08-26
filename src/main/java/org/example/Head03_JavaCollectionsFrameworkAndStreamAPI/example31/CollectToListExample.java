package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example31;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        Set<String> setData = data.stream().collect(Collectors.toSet());
        System.out.println(setData);
    }
}
