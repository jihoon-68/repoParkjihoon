package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example37;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 12, 18, 7, 3, 20);

        Map<Boolean,List<Integer>> partitioned = nums
                .stream()
                .collect(Collectors.partitioningBy(i-> i>=10));
        System.out.println(partitioned);
    }
}
