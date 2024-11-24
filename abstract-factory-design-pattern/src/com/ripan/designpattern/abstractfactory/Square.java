package com.ripan.designpattern.abstractfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}
