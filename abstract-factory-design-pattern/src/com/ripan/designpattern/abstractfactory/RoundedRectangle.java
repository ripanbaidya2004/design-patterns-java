package com.ripan.designpattern.abstractfactory;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("RoundedRectangle::draw() method.");
    }
}
