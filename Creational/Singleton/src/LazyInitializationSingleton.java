public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){};

    private static LazyInitializationSingleton getLazyInitialization() {
        if(instance == null) {
            return new LazyInitializationSingleton();
        }
        return instance;
    }
}
