package com.ripan.designpattern.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 200.0;
    }
}
