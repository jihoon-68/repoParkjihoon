package org.example.Head03_JavaProgrammingStart.example09;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("0보다 커야 합니다.");
        };
        this.balance += amount;
        System.out.println("입금: "+ amount+"원");
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        }

        if(this.balance < amount){
            throw new IllegalArgumentException("잔액 부족. 현재 금액: "+ this.balance);
        }
        this.balance -= amount;
        System.out.println("출금: "+ amount+"원");
    }

    public double getBalance(){
        return this.balance;
    }
    public String getAccountId(){
        return accountId;
    }

}
