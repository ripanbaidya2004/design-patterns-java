package com.ripan.designpattern.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    // create static instance of LazySingleton
    private static LazySingleton lazySingletonInstance = null;

    // declare a private constructor
    // nobody can create a new instance
    private LazySingleton() {}

    // get the instance of LazySingleton, using static method
    public static LazySingleton getLazySingletonInstance() {
        if(lazySingletonInstance == null){
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }


    public void displayMessage() {
        System.out.println("Inside LazySingleton..");
    }
}
