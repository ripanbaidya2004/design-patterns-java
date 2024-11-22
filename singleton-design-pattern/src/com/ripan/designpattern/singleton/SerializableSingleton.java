package com.ripan.designpattern.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    // Use transient to avoid serializing the singleton instance field
    private static transient SerializableSingleton instance = null;

    // Private constructor to prevent direct instantiation
    private SerializableSingleton() {}

    // Method to get the singleton instance
    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This method is invoked during deserialization to ensure the same instance is used.
     * @return instance of SerializableSingleton class
     */
    protected Object readResolve() {
        return instance;
    }
}
