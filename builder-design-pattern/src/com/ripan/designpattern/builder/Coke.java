package com.ripan.designpattern.builder;

public class Coke extends ColdDrinks{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 70.0;
    }
}
