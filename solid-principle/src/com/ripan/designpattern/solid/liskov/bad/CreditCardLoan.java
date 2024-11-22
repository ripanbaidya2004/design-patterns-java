package com.ripan.designpattern.solid.liskov.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(double amount) {

    }

    @Override
    public void foreClosedPayment() {
        throw new UnsupportedOperationException("force closed payment is not supported.");
    }

    @Override
    public void repayment(double amount) {
        throw new UnsupportedOperationException("repayment is not supported.");
    }
}
