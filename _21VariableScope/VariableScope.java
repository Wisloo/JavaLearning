package _21VariableScope;

public class VariableScope {
    static int x = 3; // Class scope meaning it can be accessed on different methods

    public static void main(String[] args) {

        int x = 1; // local scope variable
        System.out.println(x);
        doSomething();
        // java like to use local variables first before the class variable if they have the same name
    } static void doSomething() {
        int x = 9; // it is legal to have variables of the same name but outside of a scope

        System.out.println(x);
    }
}
