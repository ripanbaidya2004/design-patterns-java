package com.ripan.designpatterns.factory;

/**
 * Represents an abstract operating system.
 * This class is used as a base class for specific operating systems like Windows and Linux.
 * It provides common properties and methods for all operating systems.
 */
public abstract class OperatingSystem {

    private String version;
    private String architecture;

    /**
     * Constructs an OperatingSystem object with the given version and architecture.
     * @param version The version of the operating system.
     * @param architecture The architecture of the operating system.
     */
    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    /**
     * Gets the version of the operating system.
     * @return The version of the operating system.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version of the operating system.
     * @param version The version of the operating system.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the architecture of the operating system.
     * @return The architecture of the operating system.
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Sets the architecture of the operating system.
     * @param architecture The architecture of the operating system.
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }


    public abstract void changeDirectory();

    public abstract void removeDirectory();

}