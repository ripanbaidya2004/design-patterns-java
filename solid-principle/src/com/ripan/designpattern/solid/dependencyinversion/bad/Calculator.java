package com.ripan.designpattern.solid.dependencyinversion.bad;

/**
 * Calculator class is dependent on other class to perform operation, like add, sub .
 * violates dependency inversion
 */
public class Calculator {

    public int calculate(int num1, int num2, String operation) {
        int result = 0;

        switch (operation){
            case "+":
                AdditionOperation additionOperation = new AdditionOperation();
                result = additionOperation.add(num1, num2);
                break;
            case "-":
                SubtractionOperation subtractionOperation = new SubtractionOperation();
                result = subtractionOperation.sub(num1, num2);
                break;
            default:
                System.out.println("Invalid Operation");
        }
        return result;
    }
}
