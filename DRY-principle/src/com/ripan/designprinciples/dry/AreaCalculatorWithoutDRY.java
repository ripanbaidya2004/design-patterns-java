package com.ripan.designprinciples.dry;

/**
 * DRY, It stands for Do not repeat yourself, It's a software design principles widely used in software development.
 * with DRY, we can reduce the code, and try to reuse the code throughout the application.
 * to avoid Redundant code, we can use the DRY principle and group repetitive code into methods so that
 * logic may be represented clearly in just one place.
 */

public class AreaCalculatorWithoutDRY {

    // area of a rectangle
    public double calculateAreaOfRectangle(double length, double width) {
        return length * width;
    }

    // area of a circle
    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // area of a triangle
    public double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // main method of the program
    public static void main(String[] args) {

        // creating object of the class
        AreaCalculatorWithoutDRY calculator = new AreaCalculatorWithoutDRY();

        System.out.println("without DRY principle");

        // calculate and display areas
        System.out.println("Area of Rectangle: " + calculator.calculateAreaOfRectangle(4, 5));
        System.out.println("Area of Circle: " + calculator.calculateAreaOfCircle(3));
        System.out.println("Area of Triangle: " + calculator.calculateAreaOfTriangle(5, 6));

        /**
         * as we can see here we use, different methods for different shapes
         * this is not DRY, because we have to write same code again and again
         * viloation of DRY
         */
    }
}
