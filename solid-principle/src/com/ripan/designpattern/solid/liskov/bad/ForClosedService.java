package com.ripan.designpattern.solid.liskov.bad;

/**
 * here, in this example, if we use credit card loan exception will occur.
 * CreditCardLoan didn't implement forceClosedPayment method or repayment method
 * but, for HomeLoan the code will work absolutely fine
 * this violates the rule of liskov
 */
public class ForClosedService {

    private LoanPayment loanPayment;

    public ForClosedService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void forClosedPayment() {
        loanPayment.foreClosedPayment();
    }
}
