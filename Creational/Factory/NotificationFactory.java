package Creational.Factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if(type == null) return null;
        switch (type) {
            case "EMAIL" :
                return new Email();
            case "SMS" :
                return new SMS();
            case "PUSH" :
                return new Push();
            default:
                throw new IllegalArgumentException("Unknow notification type : " + type);
        }
    }
}
