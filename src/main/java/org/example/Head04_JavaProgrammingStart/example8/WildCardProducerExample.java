package org.example.Head04_JavaProgrammingStart.example8;

import java.util.ArrayList;
import java.util.List;

public class WildCardProducerExample {
    public static void printAllShapes(List<? extends Shape> shapes) {
        // **중요!** 읽기는 가능: 모든 요소가 최소한 Shape임이 보장됨
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(3.0));
        circleList.add(new Circle(4.0));
        circleList.add(new Circle(5.0));

        printAllShapes(circleList); // OK. Circle is-a Shape

    }
}
