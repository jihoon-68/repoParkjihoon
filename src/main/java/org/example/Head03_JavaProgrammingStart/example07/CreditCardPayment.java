package org.example.Head03_JavaProgrammingStart.example07;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체: " + amount + "원 결제 처리.");
    }
}
