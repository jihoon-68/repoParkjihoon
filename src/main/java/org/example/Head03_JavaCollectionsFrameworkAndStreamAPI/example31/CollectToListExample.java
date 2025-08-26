package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example31;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        List<String> setData = data.stream().collect(Collectors.toList());
        System.out.println(setData);
    }
}
