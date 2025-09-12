package _9StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String name = "o", employmentStatus = "Employed"; // index 0 = L which is the first letter, index 1 = o, and so on.
        String car = "LAMBORGHINI";
        String animal = "    La paz Bachoy    ";
        char letter = name.charAt(0); // (index of the letter or character you want to access. ex. 0 to start at index 1 or 1st character)
        int index = name.indexOf(" "); // finds the first occurrence of a character or a word. if not found it will output -1
        int length = name.length(); /* to access the length of the string.
        especially useful for when you only want a certain number of string lengths in user inputs */
        int lastIndex = name.lastIndexOf("p"); // finds the last occurrence of a character, -1 if not found
        employmentStatus = employmentStatus.toUpperCase(); // forces the string to be upper case
        car = car.toLowerCase(); // forces the string to be lower case
        animal = animal.trim(); // trims the white spaces (blank spaces)

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(employmentStatus);
        System.out.println(car);
        System.out.println(animal);
        animal = animal.replace("La", "Ce"); // replaces a character or word (character/word to be replaced, character/word that will replace)
        animal = animal.replace("paz", "pez"); // replaces a character or word (character/word to be replaced, character/word that will replace)

        System.out.println(animal);
        System.out.println(name.isEmpty()); // searches the string if it is empty and displays a boolean value.

        if(name.isEmpty()) {
            System.out.println("No name");
        } else {
            System.out.println("Hello, " + name);
        }

        if(name.contains("L")) { // checks if name has L
            System.out.println("You have an L on your name which means Love!"); // prints this if name has L
            if(name.contains("o")) { // additionally, it checks if name has o
                System.out.println("You also have an o on your name which mean obedience!"); // prints this if name has o
            }
        } else { // if name doesn't have L and o
            System.out.println("your name is not special pal"); // it prints this
        }

        if(name.equalsIgnoreCase("Louis")) { // this will ignore case sensitivity
            System.out.println("Welcome master Louis!");
        } else {
            System.out.println("Invalid user!");
        }
    }
}
