package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example07;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(40);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);


        numbers.stream()
                .filter(number -> number % 2 == 0)
                //.sorted((a,b)-> a > b?-1:1)
                .forEach(System.out::println);
    }
}
