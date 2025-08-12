package org.example.Head03_JavaProgrammingStart.example05;

public class Order {
    private String orderId;
    private Delivery delivery;  // Order는 Delivery를 포함(Has-A)

    public Order(String orderId, String trackingNumber, String carrier) {
        this.orderId = orderId;
        this.delivery = new Delivery(trackingNumber, carrier);  // 내부에서 직접 생성
    }

    public void startOrderDelivery() {
        if (delivery != null) {
            delivery.startDelivery();
        } else {
            System.out.println("배송 정보가 없습니다.");
        }
    }
}

