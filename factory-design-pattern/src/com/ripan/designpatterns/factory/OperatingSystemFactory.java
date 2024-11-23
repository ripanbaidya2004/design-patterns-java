package com.ripan.designpatterns.factory;
/**
 * Represents a factory class for creating operating system objects.
 * This class provides a way to create operating system objects without specifying the exact class.
 */
public class OperatingSystemFactory {

    // nobody is allowed to create objects of this class
    private OperatingSystemFactory() { }

    /**
     * Creates an operating system object based on the given type.
     * @param type The type of operating system to create (e.g. "linux", "windows").
     * @param version The version of the operating system.
     * @param architecture The architecture of the operating system.
     * @return The created operating system object.
     * @throws IllegalAccessException If the operating system type is unknown.
     */
    public static OperatingSystem getInstance(String type, String version, String architecture) throws IllegalAccessException {

        switch (type){
            case "windows":
                return new WindowsOperatingSystem(version, architecture);
            case "linux":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalAccessException("Unknown operating system");
        }

    }
}
