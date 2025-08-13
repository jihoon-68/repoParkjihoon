package org.example.Head04_JavaProgrammingStart.example03;

import org.example.Head04_JavaProgrammingStart.example02.NotificationSender;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue;

    public static class StaticNested{
        public void printValues(){
            System.out.println("Outer.staticValue: " + staticValue);

        }
    }
}
