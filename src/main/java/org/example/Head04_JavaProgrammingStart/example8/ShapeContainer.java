package org.example.Head04_JavaProgrammingStart.example8;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {
    private List<T> shapes =  new ArrayList<>();

    public void add(T shape) {
        shapes.add(shape);
    }

    public double totalArea() {
        double sum = 0;
        for (T s : shapes) {
            // T가 Shape의 하위 타입이므로, 안전하게 getArea() 호출 가능
            sum += s.getArea();
        }
        return sum;
    }
}
