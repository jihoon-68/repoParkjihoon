package org.example.Head02_JavaProgrammingStart.example03;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }

    //getter 생성 법 실습

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId (){
        return this.orderId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return this.products;
    }
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    public boolean getIsPaid(){
        return this.isPaid;
    }
}