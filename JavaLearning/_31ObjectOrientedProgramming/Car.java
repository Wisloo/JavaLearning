package _31ObjectOrientedProgramming;


public class Car {
    // attributes
    String make = "Honda", model = "Civic";
    int year = 2025;
    double price = 1600000;
    boolean isRunning = false;

    void start() {
        System.out.println("You started the engine");
        isRunning = true;
    }
    void stop() {
        System.out.println("You stopped the engine");
        isRunning = false;
    }
    void drive() {
        System.out.println("You drive the " + make + " " + model + " " + year);
    }
}
