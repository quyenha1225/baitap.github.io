/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2;


/**
 *
 * @author Asus
 */
public class NotificationFactory {
     public static Notification createNotification(String channel) {

        if (channel == null) {
            return null;
        }
        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return (Notification) new EmailNotification();
            default:
                throw new IllegalArgumentException("Kênh thông báo không hợp lệ");
        }
    }
}
