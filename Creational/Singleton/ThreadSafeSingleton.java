package Creational.Singleton;
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){};
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            return new ThreadSafeSingleton();
        }
        return instance;
    }
}
