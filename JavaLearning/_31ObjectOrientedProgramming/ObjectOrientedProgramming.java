package _31ObjectOrientedProgramming;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Object = an entity that holds data (attributes)
        //          and can perform actions(methods)
        //          it is a reference data type
        Car car = new Car();


        /* System.out.println(car.make); // you can access the attributes
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        car.isRunning = true; // you can change the attributes */

        car.start();
        car.stop();
        if (car.isRunning)
        {
            System.out.println("The engine is running");
        } else {
            System.out.println("The engine is not running");
        }
        car.drive();
    }
}
