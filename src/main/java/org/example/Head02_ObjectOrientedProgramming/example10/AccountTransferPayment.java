package org.example.Head02_ObjectOrientedProgramming.example10;

/**
public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}
 **/

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
    @Override
    public void cancel(double amount) {
        System.out.println("계좌이체 취소 " +amount +"원 취소");
    }
}