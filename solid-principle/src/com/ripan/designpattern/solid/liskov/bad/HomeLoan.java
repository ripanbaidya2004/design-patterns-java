package com.ripan.designpattern.solid.liskov.bad;

public class HomeLoan implements LoanPayment {

    @Override
    public void doPayment(double amount) {

    }

    @Override
    public void foreClosedPayment() {

    }

    @Override
    public void repayment(double amount) {

    }
}
