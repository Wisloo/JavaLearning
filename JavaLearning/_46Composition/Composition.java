package _46Composition;

public class Composition {
    public static void main(String[] args) {
        /* Composition = Represents a "part-of" relationship between objects.
                         For example, an Engine is "part of" a Car.
                         Allows complex objects to be constructed from smaller objects.
                         If we delete the bigger object, the smaller object will also be deleted */

        Car car = new Car("Honda Civic", 2025, "V8 Engine");

        System.out.println(car);
        car.Start();
    }
}
