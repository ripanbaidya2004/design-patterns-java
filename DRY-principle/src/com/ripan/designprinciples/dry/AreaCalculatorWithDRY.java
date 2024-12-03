package com.ripan.designprinciples.dry;

/**
 * here, we will use the DRY principle
 */
public class AreaCalculatorWithDRY {

    // calculateArea method, this will return the area of the shape
    public double calculateArea(String shape, double ... args) {
        switch (shape){
            case "rectangle" -> {
                return calculateRectangleArea(args[0], args[1]);
            }
            case "circle" -> {
                return calculateCircleArea(args[0]);
            }
            case "triangle" -> {
                return calculateTriangleArea(args[0], args[1]);
            }
            default -> {
                throw new IllegalArgumentException("Invalid shape");
            }
        }
    }

    // calculate the area of a rectangle
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // calculate the area of a triangle
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }


    // main method
    public static void main(String[] args) {

        AreaCalculatorWithDRY calculator = new AreaCalculatorWithDRY();

        System.out.println("with DRY principle");

        System.out.println("Area of Rectangle: " + calculator.calculateArea("rectangle", 4, 5));
        System.out.println("Area of Circle: " + calculator.calculateArea("circle", 3));
        System.out.println("Area of Triangle: " + calculator.calculateArea("triangle", 5, 6));
        System.out.println();
    }
}
