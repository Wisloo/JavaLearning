package _47WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        /* Wrapper classes = Allow primitive values (int, char, double, boolean)
                             to be used as objects. "Wrap them in an object"
                             Generally, don't wrap primitives unless you need an object.
                             Allows use of Collections Framework and static Utility Methods. */

        // Autoboxing
        Integer intNum = 123;
        Double doubleNum = 3.14;
        Character charSymbol = '%';
        Boolean isTrue = true;

        // Unboxing
        int intNumUnbox = intNum;
        double doubleNumUnbox = doubleNum;
        char charSymbolUnbox = charSymbol;
        boolean isTrueUnbox = isTrue;

        String intToString = Integer.toString(123); // convert a data type into string
        String doubleToString = Double.toString(3.14);
        String charToString = Character.toString('%');
        String boolToString = Boolean.toString(true);

        System.out.printf("%s %s %s %s\n", intToString, doubleToString, charToString, boolToString);

        int stringToInteger = Integer.parseInt("123");
        double stringToDouble = Double.parseDouble("3.13");
        char stringToChar = "Pizza".charAt(0);
        boolean stringToBoolean = Boolean.parseBoolean("false");

        char letter = 'b';

        System.out.println("is character a letter? " + Character.isLetter(letter)); // returns a boolean
        System.out.println("is character uppercase? " + Character.isUpperCase(letter)); // returns a boolean
    }
}
