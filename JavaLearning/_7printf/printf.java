package _7printf;

public class printf {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]
        /* [flags]
        + = output a plus
        , = comma grouping separator
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive
        */
        String name = "PatrickTheStar";
        char firstLetter = 'P';
        int age = 36;
        double height = 67.1;
        boolean isEmployed = false;

        // \n is new line since printf doesn't have print next line
        System.out.printf("Hello %s\n", name); // %s for strings
        System.out.printf("First letter of your name is: %c\n", firstLetter); // %c for characters
        System.out.printf("Age: %d years old\n", age); // %d for integers
        System.out.printf("Your height is %.1f inches tall\n", height); // %f for double
        System.out.printf("Employed: %b\n", isEmployed); // %b for boolean

        System.out.printf("%s is %.1f inches tall and their age is %d\n", name, height, age);

        double negative = -500.9879, million = 19789800.987;

        System.out.printf("%,.2f\n", million); // comma
        System.out.printf("%(.1f\n", negative); // enclosed number since negative
        System.out.printf("% .1f\n", negative); // displays minus since negative


        /* width
        0 = zero padding
        number = right justified padding
        negative number = left justified padding
        */
        int id1 = 1, id2 = 23, id3 = 456, id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

    }
}
