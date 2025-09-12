package _1Variables;

public class Variable {
    public static void main(String[] args) {
        /* ❎ variable = a reusable container for a value
                         a variable behaves as if it was the value it contains

           ❤️ Primitive = simple value stored directly in memory (stack)
           💙 Reference = memory address (stack) that points to the (heap)

           ❤️ Primitive vs 💙 Reference
           -----------      -----------
           int              string
           double           array
           char             object
           boolean

           2 Steps to creating a variable
           ------------------------------

           1. Declaration
           2. Assignment
         */
        int age = -10;
        // you want your variables to be descriptive, don't name it something vague or unclear. trust me it will help you a lot.
        // "age" is declaration while "10" is assignment
        double gpa = 1.0;
        // double can store decimals while int can only store numbers without decimal (int can also store negative values same as double)
        char currency = '$';
        // char needs '' or single quotes, and it works with characters
        boolean isReal = true;
        // boolean is a true or false variable;
        String name = "Louis";
        String email = "louislapayag16@gmail.com";
        // String is a combination of characters hence it is longer than a character and it needs double quotation.
        // to use string you should do the first letter as a big letter "String"

        /* naming conventions
            lowerCamelCase - variables and methods
            UpperCamelCase - classes, interfaces, annotations, enums, records
            SCREAMING_SNAKE_CASE - constants
            snake_case - variable and function names
         */
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);
        System.out.println("The currency you are using is " + currency);
        if (isReal) {
            System.out.println("You are real");
        } else {
            System.out.println("You are not real");
        }
        System.out.print("Your name is " + name + " ");
        System.out.println("and your email is " + email);
    }
}
