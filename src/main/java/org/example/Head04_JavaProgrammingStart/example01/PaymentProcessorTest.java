package org.example.Head04_JavaProgrammingStart.example01;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        Payment[] payments = {
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new MobilePayment()
        };

        int[] amounts = {
                30000,
                10000,
                20000
        };
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        for (int i=0;i<payments.length;i++) {
            paymentProcessor.pay(payments[i],amounts[i]);
        }
    }
}
