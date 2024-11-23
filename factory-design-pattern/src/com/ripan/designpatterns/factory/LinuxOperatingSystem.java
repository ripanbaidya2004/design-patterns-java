package com.ripan.designpatterns.factory;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDirectory() {
        // linux specific
    }

    @Override
    public void removeDirectory() {
        // linux specific
    }

}
