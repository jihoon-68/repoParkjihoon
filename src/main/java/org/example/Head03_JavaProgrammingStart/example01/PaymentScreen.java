package org.example.Head03_JavaProgrammingStart.example01;

public class PaymentScreen {
    public static void main(String[] args) {
        AccountTransferPayment a = new AccountTransferPayment();
        CreditCardPayment c = new CreditCardPayment();
        a.pay(500d);
        c.pay(500d);
    }
}
