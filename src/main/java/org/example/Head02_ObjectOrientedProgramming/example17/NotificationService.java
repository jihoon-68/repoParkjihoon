package org.example.Head02_ObjectOrientedProgramming.example17;

public class NotificationService {
    private final  NotificationSender notificationSender;
    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public void notify(String message) {
        notificationSender.send(message);
    }
}
