package _20OverloadedMethods;

public class OverloadedMethodsExample {
    public static void main(String[] args) {
        String pizza = bakePizza("Thin Crust", "Mozzarella", "Peperoni");

        System.out.println(pizza);

    }
    static String bakePizza(String bread) {
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return bread + " " + cheese + " Pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return bread + " " + cheese + " " + topping +  " Pizza";
    }
}
// useful in case there are multiple outcomes to the same method