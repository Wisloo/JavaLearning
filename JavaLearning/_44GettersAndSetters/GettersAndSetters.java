package _44GettersAndSetters;

public class GettersAndSetters {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTER = Methods that make a field WRITEABLE.

        Car car = new Car("Suzuki Every Wagon DA64V", "Army Green", 250000);
        car.setColor("Metallic Red"); // to set the private variable.
        car.setPrice(300000); // you do this.
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
