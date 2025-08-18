package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example20;

@FunctionalInterface
interface Calculator{
    int operation(int a, int b);
}
public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a+b;

        Calculator sub = (a,b) ->{
            System.out.println("subtracting...");
            return a-b;
        };

        Calculator multiplication = (a,b) -> a*b;

        Calculator division = (a,b) ->{
            System.out.println("subtracting...");
            return a/b;
        };



        System.out.println(add.operation(2,4));
        System.out.println(sub.operation(2,4));
        System.out.println(multiplication.operation(2,4));
        System.out.println(division.operation(2,4));

    }
}
