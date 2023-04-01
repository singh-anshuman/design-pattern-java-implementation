package com.anshuman.dpSingleton;

public class LazySingleton {

    //  instance set as volatile so that its value is read from the main memory everytime a thread tries to access it.
    private static volatile LazySingleton instance;

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized(LazySingleton.class) {
                //  Need to check again as multiple threads can reach the line mentioned above at the same time
                if(instance==null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Lazy Singleton");
    }
}
