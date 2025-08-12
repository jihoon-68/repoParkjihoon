package org.example.Head03_JavaProgrammingStart.example07;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드: " + amount + "원 결제 처리.");
    }

}
