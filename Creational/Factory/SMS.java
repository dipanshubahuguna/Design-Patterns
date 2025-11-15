package Creational.Factory;

public class SMS implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notify via SMS");
    }
}
