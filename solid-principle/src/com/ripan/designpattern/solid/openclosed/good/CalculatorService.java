package com.ripan.designpattern.solid.openclosed.good;

/**
 * with this approach, if we want to add any new operation then we don't need to touch the existing code
 * we can create a new class which implements the Calculator interface
 * by changing the implementation class we can change the operation
 */
public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(int num1, int num2, String operation) {
        return calculator.perform(num1, num2);
    }

}

