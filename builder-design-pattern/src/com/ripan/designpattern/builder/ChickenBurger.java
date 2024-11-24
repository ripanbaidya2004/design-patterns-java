package com.ripan.designpattern.builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 250.0;
    }
}
