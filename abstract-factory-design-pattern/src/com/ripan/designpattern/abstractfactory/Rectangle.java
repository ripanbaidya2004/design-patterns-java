package com.ripan.designpattern.abstractfactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}