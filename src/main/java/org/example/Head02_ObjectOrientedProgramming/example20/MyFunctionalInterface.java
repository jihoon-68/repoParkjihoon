package org.example.Head02_ObjectOrientedProgramming.example20;

@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();

    default void helper(){
        System.out.println("Helper method");
    }
}
