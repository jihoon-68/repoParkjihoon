package org.example.Head02_ObjectOrientedProgramming.example10;

/**
 * import org.example.Head03_JavaProgrammingStart.example01.Payment;
 * public class Order {
 *     private Payment payment;
 *
 *     public Order(Payment payment) {
 *         this.payment = payment;
 *     }
 *
 *     public void process(double amount) {
 *         payment.pay(amount);
 *     }
 * }
 *
 * **/

public class Order {
    private final AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancel(int i) {
        payment.cancel(i);
    }

}

