package com.ripan.designpattern.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("Inside EnumSingleton...");
    }
}
