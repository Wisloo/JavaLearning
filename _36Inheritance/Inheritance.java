package _36Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attribute and methods
        //               from another class
        //               Child <- Parent <- Grandparent basically multi-inheritance

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);
        plant.photosynthesize();
        dog.Eat();
        cat.Eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.Speak(); // each child can have their own methods and attributes
        cat.Speak();

        // Animal inherits from Organism (Organism = grandparent, Animal = Parent)
        // Dog and Cat inherits from Animal (Dog and Cat = child)
        // Plant inherits from Organism (Plant = child, Organism = Parent)
    }
}
