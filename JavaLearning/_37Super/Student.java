package _37Super;

public class Student extends Person { // child class
    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName); // super refers to the parent
        this.gpa = gpa;
    }
    void showGpa() {
        System.out.println(this.firstName + " " + this.lastName + " gpa is " + this.gpa);
    }
}
