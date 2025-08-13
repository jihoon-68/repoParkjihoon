package org.example.Head02_ObjectOrientedProgramming.example17;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SNS 전송: "+message);
    }
}
