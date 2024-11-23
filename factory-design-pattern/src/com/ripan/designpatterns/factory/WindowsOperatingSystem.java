package com.ripan.designpatterns.factory;

public class WindowsOperatingSystem extends OperatingSystem{

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDirectory() {
        // windows specific
    }

    @Override
    public void removeDirectory() {
        // windows specific
    }
}
