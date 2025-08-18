package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example25;

public class Transaction {
    private int id;
    private String type;  // 예: "PAYMENT", "REFUND"
    private double amount;

    public Transaction(int id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}