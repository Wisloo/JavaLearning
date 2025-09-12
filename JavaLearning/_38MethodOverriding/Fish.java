package _38MethodOverriding;

public class Fish extends Animal{

    @Override // overrides the "move" method from the animal class
    void move() {
        System.out.println("This animal is swimming");
    }
}
