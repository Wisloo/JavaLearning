package _39ToStringMethod;

public class ToStringMethod {
    public static void main(String[] args) {
        // .toString() = Method inherited from the object class
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Honda", "Civic", 2025, "Metallic Red");
        Car car2 = new Car("Toyota", "Avanza", 2025, "Army Green");

        System.out.println(car1);
        System.out.println(car2);
    }
}
