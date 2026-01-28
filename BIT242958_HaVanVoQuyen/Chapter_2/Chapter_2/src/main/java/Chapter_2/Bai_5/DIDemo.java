package Chapter_2.Bai_5;

public class DIDemo {

    public static void run() {
        System.out.println("Dang chay bai Dependency Injection");

        Notification_ notification = new Notification_();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello Email");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello SMS");
    }
}
