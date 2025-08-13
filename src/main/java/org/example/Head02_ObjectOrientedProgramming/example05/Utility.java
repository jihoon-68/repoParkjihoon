package org.example.Head02_ObjectOrientedProgramming.example05;

public class Utility {
    public  static final double DISCOUNT_RATE;

    static {
        DISCOUNT_RATE = 0.05;
    }

    public static double applyDiscount(double price){
        return price - (price * DISCOUNT_RATE);
    }
}
