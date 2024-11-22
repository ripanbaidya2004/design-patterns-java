package com.ripan.designpattern.solid.singleresponsibility;

public class AccountOperation {

    public void addAccount(){ }

    public void modifyAccount(){ }

    public void deleteAccount(){ }

    /**
     * here, deposit & withdraw are not related to account
     * these methods should not be here, and it's part of account transaction
     * this violates the single responsibility principle
     */
    public void deposit(){ }

    public void withdraw(){ }
}
