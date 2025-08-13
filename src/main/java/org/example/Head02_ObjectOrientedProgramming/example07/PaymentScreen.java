package org.example.Head02_ObjectOrientedProgramming.example07;

public class PaymentScreen {
    public static void main(String[] args) {
        AccountTransferPayment a = new AccountTransferPayment();
        CreditCardPayment c = new CreditCardPayment();
        a.pay(500d);
        c.pay(500d);
    }
}
