package org.example.Head02_ObjectOrientedProgramming.example17;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: "+message);
    }
}
