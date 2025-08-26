package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example38;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToIntFunction {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5, 12, 18, 7);
        List<Double> doubles = Arrays.asList(1.3, 2.0, 3.4, 4.2, 5.0);
        List<Long>  longs = Arrays.asList(1L, 2L, 3L, 4L, 5L);

        int intSum = ints.stream().collect(Collectors.summingInt(Integer::intValue));
        double doubleSum = doubles.stream().collect(Collectors.summingDouble(Double::doubleValue));
        long longSum = longs.stream().collect(Collectors.summingLong(Long::longValue));

        System.out.println("intSum = " + intSum);
        System.out.println("doubleSum = " + doubleSum);
        System.out.println("longSum = " + longSum);

    }
}
