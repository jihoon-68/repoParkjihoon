package org.example.Head02_ObjectOrientedProgramming.example10;

public class Topic04ExampleMain {
    public static void main(String[] args) {
        /**
        Order o1 = new Order(new CryptoPayment());
        o1.process(3);

        Order o2 = new Order(new CryptoPayment());
        o2.process(4);

        Order o3 = new Order(new CryptoPayment());
        o3.process(5);
         **/

        Order o1 = new Order(new AccountTransferPayment());
        o1.process(300000);
        o1.cancel(300000);

        Order o2 = new Order(new CreditCardPayment());
        o2.process(5000);
        o2.cancel(5000);

        Order o3 = new Order(new CryptoPayment());
        o3.process(6);
        o3.cancel(2);
    }
}
