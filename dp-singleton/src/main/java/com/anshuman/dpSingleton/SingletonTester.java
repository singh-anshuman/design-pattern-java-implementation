package com.anshuman.dpSingleton;

public class SingletonTester {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
    }
}
