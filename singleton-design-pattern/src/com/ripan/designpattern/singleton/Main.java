package com.ripan.designpattern.singleton;

import java.io.*;

/**
 * how to break singleton pattern
 * 1. using serializable
 * 2. using reflection
 * 3. using enum
 */

public class Main {
    public static void main(String[] args) throws Exception {

        usingSerializable();

        usingReflection();

        usingEnum();
    }

    private static void usingEnum() {
        EnumSingleton.INSTANCE.doSomething();
    }

    private static void usingReflection() throws Exception {
        // Get the class object for LazySingleton
        Class<?> clazz = LazySingleton.class;

        // Get the private constructor of the class
        java.lang.reflect.Constructor<?> constructor = clazz.getDeclaredConstructor();

        // Make the constructor accessible (bypassing private visibility)
        constructor.setAccessible(true);

        // Create two instances of the singleton class using reflection
        LazySingleton instance1 = (LazySingleton) constructor.newInstance();
        LazySingleton instance2 = (LazySingleton) constructor.newInstance();

        // Print the hashCodes of both instances to show they are different
        System.out.println("Reflection created instance1 hashCode: " + instance1.hashCode());
        System.out.println("Reflection created instance2 hashCode: " + instance2.hashCode());

        // This will print two different hash codes, breaking the Singleton pattern.
    }


    private static void usingSerializable() throws IOException, ClassNotFoundException {

        LazySingleton lazySingleton = LazySingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.obj"));
        LazySingleton deserializedSingleton = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("original singleton: " + lazySingleton.hashCode());
        System.out.println("deserialized singleton: " + deserializedSingleton.hashCode());
        // this will give two different hash codes, this is a problem
        // to solve this, we will override the readResolver() in serializableSingleton(C)
        // open the SerializableSingleton file and override the readResolve()


        /**
         * using SerializableSingleton class.
         */
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("singleton1.obj"));
        objectOutputStream1.writeObject(serializableSingleton);
        objectOutputStream1.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("singleton1.obj"));
        SerializableSingleton deserializedSingleton1 = (SerializableSingleton) objectInputStream1.readObject();
        objectInputStream1.close();

        System.out.println("original singleton: " + serializableSingleton.hashCode());
        System.out.println("deserialized singleton: " + deserializedSingleton1.hashCode());
    }
}
