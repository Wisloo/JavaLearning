package _34ArrayOfObjects;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Pink");
        Car car2 = new Car("Toyota", "Blue");
        Car car3 = new Car("Suzuki", "Green");

        Car[] cars = {car1, car2, car3}; // makes object as array

        for(int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        // enhanced for loop
        for(Car car : cars){
            car.drive();
        }
    }
}
