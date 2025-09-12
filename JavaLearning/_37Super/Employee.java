package _37Super;

public class Employee extends Person {
    int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName); // refers to the constructors on the parent class
        this.salary = salary;
    }
    void showSalary() {
        System.out.println(this.firstName + " " + this.lastName + " salary is " + this.salary);
    }
}
