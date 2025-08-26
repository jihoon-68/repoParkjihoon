package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example41;

import java.util.*;
import java.util.stream.Collectors;


public class SummarizingExample {
    public static void main(String[] args) {
        List<Integer> intScores = Arrays.asList(80, 95, 70, 100, 85);
        List<Double> doubleScores = Arrays.asList(80d, 95d, 70d, 100d, 85d);
        List<Long> longScores = Arrays.asList(80l, 95l, 70l, 100l, 85l);

        IntSummaryStatistics intSummaryStatistics = intScores.stream().collect(Collectors.summarizingInt(Integer::intValue));

        DoubleSummaryStatistics doubleSummaryStatistics = doubleScores.stream().collect(Collectors.summarizingDouble(Double::doubleValue));

        LongSummaryStatistics longSummaryStatistics = longScores.stream().collect(Collectors.summarizingLong(Long::longValue));


        System.out.println("Int Summary Count = " + intSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + intSummaryStatistics.getSum());
        System.out.println("Int Summary Min = " + intSummaryStatistics.getMin());
        System.out.println("Int Summary Max = " + intSummaryStatistics.getMax());
        System.out.println("Int Summary Average = " + intSummaryStatistics.getAverage());

        System.out.println("Int Summary Count = " + doubleSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + doubleSummaryStatistics.getSum());
        System.out.println("Int Summary Min = " + doubleSummaryStatistics.getMin());
        System.out.println("Int Summary Max = " + doubleSummaryStatistics.getMax());
        System.out.println("Int Summary Average = " + doubleSummaryStatistics.getAverage());

        System.out.println("Int Summary Count = " + longSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + longSummaryStatistics.getSum());
        System.out.println("Int Summary Min = " + longSummaryStatistics.getMin());
        System.out.println("Int Summary Max = " + longSummaryStatistics.getMax());
        System.out.println("Int Summary Average = " + longSummaryStatistics.getAverage());
    }
}
