package com.ripan.designpattern.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {

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
