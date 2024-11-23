package com.ripan.designpatterns.factory.abstractfactory;

public class RoundedCircle implements Shape{

    @Override
    public void draw() {
        System.out.println("RoundedCircle::draw() method.");
    }
}
