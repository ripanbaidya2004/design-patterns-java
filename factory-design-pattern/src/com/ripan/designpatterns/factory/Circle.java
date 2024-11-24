package com.ripan.designpatterns.factory;

// Circle class implements Shape interface and overrides the draw() method
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
