package _46Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model, int year, String engineType) { // when constructing a car object
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // we will also be constructing a new engine object
    }

    void Start() {
        this.engine.Start();
        System.out.printf("\nThe %s is running", this.model);
    }
    @Override
    public String toString() {
        return this.model + " " + this.year + " " + this.engine;
    }
}
