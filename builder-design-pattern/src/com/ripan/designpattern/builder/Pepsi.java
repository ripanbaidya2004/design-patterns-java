package com.ripan.designpattern.builder;

public class Pepsi extends ColdDrinks{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 50.0;
    }
}
