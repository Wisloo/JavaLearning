package _40Abstraction;

public abstract class Shape { // we cannot create any shape objects
    abstract double area(); // child should have the abstract method

    void display() { // Concrete method
        System.out.println("This is a shape");
    }
}
