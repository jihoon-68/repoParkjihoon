package org.example.Head03_JavaProgrammingStart.example07;

public class OrderService {
    public void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
