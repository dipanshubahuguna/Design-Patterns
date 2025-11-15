package Creational.Factory;

public class ClientTest {
    /*
    The main motive of crating factory design pattern is to make client free from creating objects.
    It will be handled by a separate class which is termed as "factory".
    If any changes for creation needs to be done will be on the factory side not on the client side.
    */

    public static  void main(String[] args) {

        Notification notification1 = NotificationFactory.createNotification("EMAIL");
        Notification notification2 = NotificationFactory.createNotification("SMS");
        Notification notification3 = NotificationFactory.createNotification("PUSH");

        notification1.notifyUser();
        notification2.notifyUser();
        notification3.notifyUser();
    }
}
