package com.anshuman.dpSingleton;

public class LazySingleton {

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Lazy Singleton");
    }
}
