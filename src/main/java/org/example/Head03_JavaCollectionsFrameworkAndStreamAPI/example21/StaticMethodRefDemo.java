package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example21;

import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        // 람다 식
        // Function<Integer, Integer> f1 = num -> StaticMethodRefDemo.doubleValue(num);

        Function<Integer, Integer> f2 =  StaticMethodRefDemo::doubleValue;
        System.out.println(f2.apply(2));
    }
}
