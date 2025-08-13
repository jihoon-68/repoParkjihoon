package org.example.Head02_ObjectOrientedProgramming.example20;

public class LambdaDemo {
    public static void main(String[] args) {

        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int a, int b) {
               return a + b;
            }
        };
        System.out.println("익명 클래스: 3 + 5 = " + addAnon.operate(3, 5));

        MyCalculator addLambda = (x,y) -> x - y;
        System.out.println("익명 클래스: 3 - 5 = " + addLambda.operate(3, 5));
    }
}
