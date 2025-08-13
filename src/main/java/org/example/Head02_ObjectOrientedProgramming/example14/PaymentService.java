package org.example.Head02_ObjectOrientedProgramming.example14;

public class PaymentService {

    public void processPayment(UserAccount userAccount, double amount) {
        if(amount <=0){
            throw new IllegalArgumentException("결제 금액은 0보다 커야 합니다.");
        }
        userAccount.withdraw(amount);
        System.out.println("결제 서비스: 계좌 [" + userAccount.getAccountId() + "]에 대해 " + amount + "원 결제 완료.");
    }

    public void processRefund(UserAccount  userAccount, double amount) {
        if(amount <=0){
            throw new IllegalArgumentException("환불 금액은 0보다 커야 합니다.");
        }
        userAccount.deposit(amount);
        System.out.println("결제 서비스: 계좌 [" + userAccount.getAccountId() + "]에 " + amount + "원 환불 완료.");
    }
}
