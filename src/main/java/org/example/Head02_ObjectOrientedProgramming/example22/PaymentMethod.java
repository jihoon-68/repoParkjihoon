package org.example.Head02_ObjectOrientedProgramming.example22;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일 결재");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return "결재 방식: "+displayName;
    }
}
