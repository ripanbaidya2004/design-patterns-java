package com.ripan.designpatterns.factory;

// Rectangle class implements Shape interface and overrides the draw() method

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
