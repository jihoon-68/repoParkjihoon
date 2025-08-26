package org.example.Head04_JavaProgrammingStart.example10;

import java.util.List;

public class AfterGenericMethodExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana");
        List<Integer> numbers = List.of(1, 2, 3);
        List<User> users = List.of(new User("Alice"), new User("Bob"));

        // 하나의 메서드로 모든 타입 처리
        // 람다식으로 각 타입별 포맷 지정
        PrinterAfterGenericMethod.printList(strings, s -> "String: " + s);
        PrinterAfterGenericMethod.printList(numbers, n -> "Integer: " + n);
        PrinterAfterGenericMethod.printList(users, u -> "User: " + u.getName());

        // 새로운 타입
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        PrinterAfterGenericMethod.printList(doubles, d -> "Double: " + d);
    }
}
