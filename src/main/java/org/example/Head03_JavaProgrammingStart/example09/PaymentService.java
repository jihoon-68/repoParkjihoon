package org.example.Head03_JavaProgrammingStart.example09;

public class PaymentService {
    public void processPayment(UserAccount acc, double amount) {

        acc.withdraw(amount);
        System.out.println("결제 완료. 잔액: " + acc.getBalance() +"원");
    }

    public void processRefund(UserAccount acc, double amount) {
        acc.deposit(amount);
        System.out.println("환불 완료. 잔액: " + acc.getBalance()+"원");
    }
}
