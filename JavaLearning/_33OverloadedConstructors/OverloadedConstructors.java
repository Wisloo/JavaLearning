package _33OverloadedConstructors;

public class OverloadedConstructors {
    public static void main(String[] args) {
        // overloaded constructors = allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           enable objects to be initialized in various ways.

        Users user1 = new Users("ChingusLingus");
        Users user2 = new Users("MekusMekus", "mekus69@gmail.com");
        Users user3 = new Users("NinjaSaga", "mekus69@gmail.com", 22);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}
