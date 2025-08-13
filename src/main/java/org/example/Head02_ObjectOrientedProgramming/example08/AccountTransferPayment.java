package org.example.Head02_ObjectOrientedProgramming.example08;

public class AccountTransferPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("계좌이체 결제 완료: " + amount + "원");
    }
    @Override
    public void cancel(double amount) {
        validateCancel(amount);
        System.out.println("계좌이체 결제 취소: " + amount + "원");
    }
}
