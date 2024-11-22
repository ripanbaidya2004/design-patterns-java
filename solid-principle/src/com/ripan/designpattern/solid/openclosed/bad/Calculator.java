package com.ripan.designpattern.solid.openclosed.bad;

/**
 * open closed principle says that, we should be open for extension but closed for modification
 * here, in this example, if we want to perform addition or subtraction, we can easily do that.
 * if we want to perform the multiplication or division, we can't do that.
 * we need to modify the code.
 * which violates the open closed principle.
 */
public class Calculator {

    public int calculate(int num1, int num2, String operation) {
        int result = 0;

        switch (operation) {
            case "+" : result = num1 + num2; break;
            case "-" : result = num1 - num2; break;
            default:
                System.out.println("Invalid Operation");
        }
        return result ;
    }
}
