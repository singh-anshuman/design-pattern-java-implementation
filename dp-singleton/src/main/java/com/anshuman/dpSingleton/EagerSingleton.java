package com.anshuman.dpSingleton;

public class EagerSingleton {

    private static EagerSingleton instance;

    public static EagerSingleton getInstance() {
        return instance;
    }

    {
        //  Instance created at the time of class loading
        instance = new EagerSingleton();
    }

    public void doSomething() {
        System.out.println("Eager Singleton");
    }
}
