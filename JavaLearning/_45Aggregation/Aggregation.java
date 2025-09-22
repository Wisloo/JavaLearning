package _45Aggregation;

public class Aggregation {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationship between objects.
        //               one object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Discrete Mathematics", 1000);
        Book book2 = new Book("Linear Algebra", 500);
        Book book3 = new Book("Discrete Structures and Algorithms", 2000);

        Book books[] = {book1, book2, book3};

        Library library = new Library("California Private Library", 2005, books); // you are passing the array of books

        library.displayInfo();
    }
}
