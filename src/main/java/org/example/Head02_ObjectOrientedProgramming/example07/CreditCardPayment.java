package org.example.Head02_ObjectOrientedProgramming.example07;

public class CreditCardPayment  implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}
