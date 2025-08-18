package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachFruitsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> print = new  Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Fruit: "+s);
            }
        };

        Stream<String> nameStream = names.stream();
        nameStream.forEach(print);
    }
}
