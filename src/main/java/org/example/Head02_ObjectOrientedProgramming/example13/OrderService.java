package org.example.Head02_ObjectOrientedProgramming.example13;

public class OrderService {
    public void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
