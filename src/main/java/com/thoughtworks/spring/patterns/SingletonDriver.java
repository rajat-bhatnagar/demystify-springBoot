package com.thoughtworks.spring.patterns;

/**
 * Created by rajatbhatnagar on 12/7/15.
 */
public class SingletonDriver {
    public static void main(String[] args) {
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
    }
}
