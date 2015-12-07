package com.thoughtworks.spring.patterns;

/**
 * Created by rajatbhatnagar on 12/6/15.
 */
public class EagerSingleton {
    private static volatile EagerSingleton instance = null;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        if (instance == null) {
            synchronized (EagerSingleton.class) {
                if (instance == null) {
                    instance = new EagerSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton one = EagerSingleton.getInstance();
        EagerSingleton two = EagerSingleton.getInstance();
        System.out.println("one :: " + System.identityHashCode(one));
        System.out.println("two :: " + System.identityHashCode(two));
    }
}
