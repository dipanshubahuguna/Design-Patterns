public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;
    private DoubleCheckedLockingSingleton(){};

    private static DoubleCheckedLockingSingleton getDoubleCheckedLockingSingleton(){
        if(instance == null) {
            synchronized(DoubleCheckedLockingSingleton.class) {
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
