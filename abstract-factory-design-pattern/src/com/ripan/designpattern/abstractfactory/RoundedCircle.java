package com.ripan.designpattern.abstractfactory;

public class RoundedCircle implements Shape {

    @Override
    public void draw() {
        System.out.println("RoundedCircle::draw() method.");
    }
}
