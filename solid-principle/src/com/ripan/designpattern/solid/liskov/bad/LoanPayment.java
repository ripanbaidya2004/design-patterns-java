package com.ripan.designpattern.solid.liskov.bad;

/**
 * LoanPayment having three method for different types of loan.
 * we can implement methods for different types of loan, such as home loan, credit card loan etc.
 * credit card loan is unsecured loan, so we cant implement foreClosedPayment method or repayment method
 *
 */
public interface LoanPayment {

    void doPayment(double amount) ;

    void foreClosedPayment();

    void repayment(double amount) ;
}
