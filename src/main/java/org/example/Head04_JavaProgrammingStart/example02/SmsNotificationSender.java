package org.example.Head04_JavaProgrammingStart.example02;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SNS 전송: "+message);
    }
}
