package _32Constructors;

public class Constructors {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects
        //               you can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Louis", 19, 1.7);
        Student student2 = new Student("Dei", 22, 1.5);
        Student student3 = new Student("Chingus", 300, 5.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();
        System.out.println();
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
        System.out.println();
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
