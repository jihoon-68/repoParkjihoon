package org.example.Head02_ObjectOrientedProgramming.example03;

public class Product {
    private String productId;
    private String name;
    private double price;

    // 생성자
    public Product() {}

    public Product(String productId){
        this.productId = productId;
    }

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    // Getter 메서드
    public String getProductId(){
        return this.productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
