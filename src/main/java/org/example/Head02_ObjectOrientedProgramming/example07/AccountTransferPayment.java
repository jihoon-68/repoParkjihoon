package org.example.Head02_ObjectOrientedProgramming.example07;

public class AccountTransferPayment  implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 "+ amount + "원 결제 완료");
    }
}
