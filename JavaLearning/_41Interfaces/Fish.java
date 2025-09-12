package _41Interfaces;

public class Fish implements Prey, Predator{ // interfaces can be implemented more than once
    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The fish is swimming away");
    }
}
