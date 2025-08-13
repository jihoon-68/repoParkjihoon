package org.example.Head04_JavaProgrammingStart.example07;

public class PaymentMethodMain {
    public static void main(String[] args) {
        for(PaymentMethod pay: PaymentMethod.values()){
            System.out.println(pay);
        }

        PaymentMethod method = PaymentMethod.CREDIT_CARD;

        switch(method){
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택");
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("계좌이체 결재 선택");
                break;
            case MOBILE_PAYMENT:
                System.out.println("모바일 결재 선택");
                break;
        }
    }
}
