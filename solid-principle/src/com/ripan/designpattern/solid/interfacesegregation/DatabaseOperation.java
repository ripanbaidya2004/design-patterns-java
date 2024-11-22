package com.ripan.designpattern.solid.interfacesegregation;

public class DatabaseOperation implements DatabaseUtil{
    // as we can see, each interface contains specific operation

    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }
}
