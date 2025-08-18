package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example06;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumbersExample {
    public static void main(String[] args) {
        List<Integer>  numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        Stream<Integer> stream = numbers.stream();
        Stream<Integer> evenStream = stream.filter(isEven); //filter 의 중간 연산

        evenStream.forEach(num -> System.out.println("Even number: " + num));

    }
}

