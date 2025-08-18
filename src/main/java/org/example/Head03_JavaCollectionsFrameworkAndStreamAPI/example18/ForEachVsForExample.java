package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example18;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        System.out.println("=== Using for loop ===");
        for(int i=0; i< numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                System.out.println("Even number: "+numbers.get(i));
            }

        }

        System.out.println("=== Using enhanced for ===");
        for(Integer i: numbers){
            if(i % 2 == 0)System.out.println("Even number: "+i);
        }

        System.out.println("=== Using Stream forEach ===");
        numbers.stream().filter(number -> number % 2 == 0)
                        .forEach(n-> System.out.println("Even number: "+n));

    }
}
