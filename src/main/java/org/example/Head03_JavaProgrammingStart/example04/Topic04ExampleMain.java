package org.example.Head03_JavaProgrammingStart.example04;

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

        Order o1 = new Order(new CryptoPayment());
        o1.process(3);
        o1.cancel(3);

        Order o2 = new Order(new CryptoPayment());
        o2.process(5);
        o2.cancel(5);

        Order o3 = new Order(new CryptoPayment());
        o3.process(6);
        o3.cancel(2);
    }
}
