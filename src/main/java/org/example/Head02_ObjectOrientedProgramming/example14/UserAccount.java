package org.example.Head02_ObjectOrientedProgramming.example14;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        if(accountId == null||accountId.isEmpty()){
            throw  new IllegalArgumentException("유효하지 않은 계좌");
        }
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(this.balance <= 0){
            throw new IllegalArgumentException("유효하지 않은 금액");
        }
        this.balance += amount;
        System.out.println("계좌 [ "+ this.accountId + " ]에 " + amount +"원 임금. 현재 잔액 "+ this.balance+"원");
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다");
        }

        if(this.balance <= amount){
            throw new IllegalArgumentException("잔액이 부족합니다. 현재 잔액: "+ this.balance+"원");
        }

        this.balance -= amount;
        System.out.println("계좌 [ "+ this.accountId + "]에서 "+amount+"원 출금. 남은 잔액: "+ this.balance+"원" );
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountId() {
        return accountId;
    }

    public void setBalance(double balance) {}



}
