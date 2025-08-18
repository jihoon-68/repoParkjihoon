package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example22;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    public  void printString(String s){
        System.out.println("String: " + s);
    }
    public static void main(String[] args) {
        InstanceMethodRefDemo obj = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");


        list.forEach(obj::printString);

    }
}
