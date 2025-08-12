package org.example.Head03_JavaProgrammingStart.example07;

public class PolymorphismTest {
    public static void main(String[] args) {
        //업 케스팅 사용
        Payment[] payments ={
                new AccountTransferPayment(),
                new CreditCardPayment()
        };

        OrderService orderService = new OrderService();

        for(Payment payment : payments){
            if(payment instanceof AccountTransferPayment){

                //다운 케스팅 사용
                AccountTransferPayment accountTransferPayment = (AccountTransferPayment) payment;
                System.out.println("가드 수수료 발생: 1000원");
                orderService.processPayment(accountTransferPayment, 11000);

            }else if(payment instanceof CreditCardPayment){

                //다운 케스팅 사용 안하고 바로 payment 사용
                System.out.println("같은 은행 계좌송금 수수료 없음");
                orderService.processPayment(payment,10000);
            }

            System.out.println();
        }


    }
}
