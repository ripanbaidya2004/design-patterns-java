package com.ripan.designpattern.solid.singleresponsibility;

/**
 * each should have a single responsibility
 * if a class has more than one responsibility, it should be refactored
 *
 */
public class TransactionOperation {

    public void deposit(Account account, double amount) { }

    public void withdraw(Account account, double amount) { }
}
