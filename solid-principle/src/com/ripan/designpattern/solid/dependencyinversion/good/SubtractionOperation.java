package com.ripan.designpattern.solid.dependencyinversion.good;

public class SubtractionOperation implements Calculator{
    @Override
    public int perform(int num1, int num2) {
        return num1 - num2;
    }
}
