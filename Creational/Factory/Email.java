package Creational.Factory;

public class Email implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notify via Email");
    }
}
