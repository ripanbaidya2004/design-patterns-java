package com.ripan.designpatterns.factory.basic;

// Square class implements Shape interface and overrides the draw() method
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
