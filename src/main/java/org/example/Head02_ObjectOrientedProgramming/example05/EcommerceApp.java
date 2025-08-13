package org.example.Head02_ObjectOrientedProgramming.example05;

import static org.example.Head02_ObjectOrientedProgramming.example05.Utility.applyDiscount;

public class EcommerceApp {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double finalPrice = applyDiscount(originalPrice);
        System.out.println("할인 적용된 가격: "+ finalPrice);
    }
}
