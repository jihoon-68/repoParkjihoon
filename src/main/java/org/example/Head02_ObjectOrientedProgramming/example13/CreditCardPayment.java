package org.example.Head02_ObjectOrientedProgramming.example13;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체: " + amount + "원 결제 처리.");
    }
}
