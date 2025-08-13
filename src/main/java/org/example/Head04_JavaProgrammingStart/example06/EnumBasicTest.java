package org.example.Head04_JavaProgrammingStart.example06;

public class EnumBasicTest {
    public enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        for(Level level:Level.values()){
            System.out.println(level + " ordinal=" + level.ordinal());
        }
        Level todaay = Level.LOW;
        System.out.println("name():"+todaay.name());
    }
}
