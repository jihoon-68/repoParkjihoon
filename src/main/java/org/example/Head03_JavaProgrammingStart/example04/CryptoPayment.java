package org.example.Head03_JavaProgrammingStart.example04;

/**
 * import org.example.Head03_JavaProgrammingStart.example01.Payment;
 * public class CryptoPayment  implements Payment{
 *     @Override
 *     public void pay(double amount) {
 *         System.out.println("코인 계좌로 " + amount + "코인 결제 완료.");
 *     }
 *     @Override
 *     public void close(double amount) {
 *         System.out.println("결제 취소: " + amount + "코인");
 *     }
 * }
 *
 * */


public class CryptoPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("코인 계좌로 " + amount + "코인 결제 완료.");
    }
    @Override
    public void cancel(double amount) {
        System.out.println("결제 취소: " + amount + "코인");
    }
}
