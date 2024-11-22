package com.ripan.designpattern.singleton;

public class MultithreadingSingleton {

    private static MultithreadingSingleton instance = null;

    private MultithreadingSingleton(){
        // nobody can create an object of this class
    }

    public static MultithreadingSingleton getInstance(){
        if(instance == null){
            synchronized (MultithreadingSingleton.class){
                if(instance == null){
                    instance = new MultithreadingSingleton();
                }
            }
        }
        return instance;
    }
}
