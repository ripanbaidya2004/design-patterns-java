package com.ripan.designpatterns.factory.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        } else if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new RoundedCircle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else{
            return null;
        }
    }

}
