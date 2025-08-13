package org.example.Head02_ObjectOrientedProgramming.example16;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드 결제: " + amount + "원");
    }
}