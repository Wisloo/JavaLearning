package _55AnonymousClasses;

public class AnonymousClasses {
    public static void main(String[] args) {
        // Anonymous Class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog = new Dog();
        Dog talkingDog = new Dog() {
            @Override
            void Speak () {
                System.out.println("Scooby doo goes Ruh Roh!");
            }
        };


        dog.Speak();
        talkingDog.Speak();

    }
}
