package org.example.Head03_JavaProgrammingStart.example04;

public class CreditCardPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
    @Override
    public void cancel(double amount) {
        System.out.println("신용카드 취소 " + amount + "원 취소.");
    }
}
