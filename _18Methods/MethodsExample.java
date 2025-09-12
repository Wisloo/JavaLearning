package _18Methods;

public class MethodsExample {
    public static void main(String[] args) {

    System.out.println(square(3));
    System.out.println(cube(9));
    String fullName = getFullName("Louis", "Lapayag");
    System.out.println(fullName);
    int age = 22;

    if(ageCheck(age)) {
        System.out.println("You may sign up");
    } else {
        System.out.println("You must be 18+ to sign up");
    }
    }
    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck (int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
