package _46Composition;

public class Engine {
    String engineType;

    Engine (String engineType) {
        this.engineType = engineType;
    }

    void Start() {
        System.out.printf("Starting the car with %s", this.engineType);
    }
    @Override
    public String toString() {
        return engineType;
    }
}
