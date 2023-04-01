package com.anshuman.dpSingleton;

public class EagerSingleton {

    // Instance created at the time of class loading
    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Eager Singleton");
    }
}
