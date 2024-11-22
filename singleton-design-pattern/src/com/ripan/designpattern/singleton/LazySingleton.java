package com.ripan.designpattern.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    // create static instance of LazySingleton
    private static LazySingleton instance = null;

    // declare a private constructor
    // nobody can create a new instance
    private LazySingleton() {}

    // get the instance of LazySingleton, using static method
    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
