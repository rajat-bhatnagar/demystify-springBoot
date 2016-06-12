package com.thoughtworks.spring.patterns;

/**
 * Created by rajatbhatnagar on 12/7/15.
 */
public class SingletonDispenser {
    public static class ThreadLocalSingleton extends ThreadLocal{
        //In inner class we implement the initializeValue method
        public Object initialValue(){
            return Singleton.getInstance();
        }
    }

    private static ThreadLocalSingleton conn = new ThreadLocalSingleton();

    public static Singleton getThreadLocalSingleton(){
        return (Singleton) conn.get();
    }
}
