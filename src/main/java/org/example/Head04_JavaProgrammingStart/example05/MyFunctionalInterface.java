package org.example.Head04_JavaProgrammingStart.example05;

@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();

    default void helper(){
        System.out.println("Helper method");
    }
}
