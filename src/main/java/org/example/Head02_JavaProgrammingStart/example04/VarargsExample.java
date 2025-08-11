package org.example.Head02_JavaProgrammingStart.example04;

public class VarargsExample {
    public static void main(String[] args) {

    }
}

class Example{
    void print(int a, int b) {
        System.out.println("fixed two ints");

    }

    void print(int... nums){
        System.out.println("varargs ints");
    }
}
