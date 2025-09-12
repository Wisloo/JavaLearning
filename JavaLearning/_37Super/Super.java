package _37Super;


public class Super {
    public static void main(String[] args) {
        // super = refers to the parent class (subclass <- superclass)
        //         used in constructors and method overriding
        //         calls the parent constructor to initialize attributes

        Person person1 = new Person("Deisticles", "Akiskis");
        Student student = new Student("Louisticles", "Akiskis", 1.7);
        Employee AlexisAnciado = new Employee("Alexis", "Anciado", 9000);


        person1.showName();
        student.showName();
        student.showGpa();
        AlexisAnciado.showSalary();
    }
}
