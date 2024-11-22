package com.ripan.designpattern.solid.liskov.good;

public class ForeClosedService {

    private SecureLoan secureLoan;

    public ForeClosedService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void foreClosedPayment() {
        secureLoan.foreClosedPayment();
    }
}
