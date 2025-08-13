package org.example.Head02_ObjectOrientedProgramming.example18;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue;

    public static class StaticNested{
        public void printValues(){
            System.out.println("Outer.staticValue: " + staticValue);

        }
    }
}
