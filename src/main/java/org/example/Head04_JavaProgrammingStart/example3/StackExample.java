package org.example.Head04_JavaProgrammingStart.example3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int firstPop = stack.pop();
        System.out.println("oldStack 첫번째 pop: " + firstPop);
        int secondPeek = stack.peek();
        System.out.println("oldStack 두번째 peek: " + secondPeek);
        int secondPop = stack.pop();
        System.out.println("oldStack 두번째 pop: " + secondPop);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("\n[stackWithArrayDeque 결과]");
        System.out.println("stackWithArrayDeque pop : " + deque.pop());
        System.out.println("stackWithArrayDeque 다음요소 peek : " + deque.peek());

    }
}
