package org.example.Head02_ObjectOrientedProgramming.example15;



public class PaymentServiceTest {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("000000001");
        PaymentService paymentService = new PaymentService();

        userAccount.deposit(5000);

        System.out.println(userAccount.getBalance()+"원");


        try{
            userAccount.deposit(-500);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            userAccount.withdraw(-500);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            userAccount.withdraw(6000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        paymentService.processPayment(userAccount,500);
        System.out.println();
        paymentService.processRefund(userAccount,500);


    }
}
