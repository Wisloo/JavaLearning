package _18Methods;

public class Methods {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()

        String name = "Louis";
        int age = 19;
        happyBirthday(name, age); // calling a method

    }
    static void happyBirthday (String name, int age) { // passing an argument, basically means you pass the variables of the main method inside this method
        System.out.printf("Happy birthday %s\n", name);
        System.out.printf("Happy birthday %s\n", name);
        System.out.printf("Happy birthday %s\n", name);
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.println("Happy birthday to youuuuu!");
        System.out.printf("you are %d years old\n", age);

    }

}
