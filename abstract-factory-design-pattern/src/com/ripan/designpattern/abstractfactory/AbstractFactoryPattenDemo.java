package com.ripan.designpattern.abstractfactory;

public class AbstractFactoryPattenDemo {
    public static void main(String[] args) {

        // get Shape Factory. here, first rounder(true)
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        // get shape of the factory
        Shape roundedShape1 = shapeFactory.getShape("CIRCLE");
        roundedShape1.draw();

        Shape roundedShape2 = shapeFactory.getShape("RECTANGLE");
        roundedShape2.draw();


        // get Shape Factory. here, first rounder(false)
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);
        // get shape of the factory
        Shape shape1 = shapeFactory2.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory2.getShape("RECTANGLE");
        shape2.draw();

    }
}
