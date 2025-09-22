package _42Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat}; // car, bike, and boat identify as vehicles

        for(Vehicle vehicle : vehicles) {
            vehicle.go(); // each of the element in the array has a go method
        }
    }
}
