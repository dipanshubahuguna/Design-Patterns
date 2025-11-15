package Creational.Factory;

public class Push implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notify via Push");
    }
}
