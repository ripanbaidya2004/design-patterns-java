package com.ripan.designpattern.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
    /**
     * with eager initialization, instance is created when class is loaded
     * if the object is not used, still it is created and in the jvm.
     * multiple threads can access the same instance
     */
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

}
