package com.thoughtworks.spring.patterns;

/**
 * Created by rajatbhatnagar on 12/7/15.
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;
    //Create a private constructor
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                instance = new LazySingleton();
            }
        }
        return instance;
    }

}
