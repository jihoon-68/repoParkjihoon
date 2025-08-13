package org.example.Head04_JavaProgrammingStart.example02;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: "+message);
    }
}
