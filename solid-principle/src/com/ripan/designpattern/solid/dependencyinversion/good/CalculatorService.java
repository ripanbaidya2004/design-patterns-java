package com.ripan.designpattern.solid.dependencyinversion.good;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(int num1, int num2, String operation) {
        return calculator.perform(num1, num2);
    }

}
