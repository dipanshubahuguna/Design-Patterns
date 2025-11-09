public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){};
    private static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
        if(instance == null){
            return new ThreadSafeSingleton();
        }
        return instance;
    }
}
