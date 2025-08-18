package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPracticeRefactored {
    public void println(String s){
        System.out.println("매서드 참조"+s);
    }

    public static String toUpperCase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // TODO 구현



        Consumer<String> print = name -> System.out.println(name);
        names.forEach(print);



        Predicate<String> lengthCheck = name -> name.length() >= 5;
        names.stream()
                .filter(lengthCheck)
                .forEach(System.out::println);



        Function<String, String> f2 =LambdaPracticeRefactored::toUpperCase;
        System.out.println(f2.apply("Alice"));

        LambdaPracticeRefactored demo = new LambdaPracticeRefactored();


        Function<String,String> toUpperCase = name -> name.toUpperCase();
        names.stream()
                .map(toUpperCase)
                .forEach(System.out::println);



        System.out.println(toUpperCase.apply("메소드 참조"));
        names.stream()
                .map(toUpperCase)
                .forEach(demo::println);

    }
}