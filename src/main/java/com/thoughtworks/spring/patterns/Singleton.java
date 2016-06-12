package com.thoughtworks.spring.patterns;

/**
 * Created by rajatbhatnagar on 12/7/15.
 */
public class Singleton {
    private Singleton(){
        //This output statement will tell us how many times an instance has been created
        System.out.println("Singleton has been created");
    }

    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    public void printSingleton(){
        System.out.println("Inside print singleton");
    }
}
