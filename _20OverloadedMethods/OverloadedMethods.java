package _20OverloadedMethods;

public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters
        System.out.println(add(1,2));
        System.out.println(add(98, 29, 33));
        System.out.println(add(98, 29, 33, 22));

    }
    static double add(double num1, double num2) { // same name
        return num1 + num2 ;
    }
    static double add(double num1, double num2, double num3) { // different parameters
        return num1 + num2 + num3;
    }
    static double add(double num1, double num2, double num3, double num4) { // different parameters
        return num1 + num2 + num3 + num4;
    }
}
