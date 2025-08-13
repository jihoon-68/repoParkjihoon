package org.example.Head02_ObjectOrientedProgramming.example17;

public class DipTest {
    public static void main(String[] args) {

        NotificationSender[] notificationSender = {
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };

        for (NotificationSender sender : notificationSender) {
            NotificationService notification = new NotificationService(sender);
            notification.notify("Hello World");
        }
    }
}
