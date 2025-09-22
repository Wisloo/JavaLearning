package _45Aggregation;

public class Library {
    String name;
    int yearEstablished;
    Book[] books; // create an array of books

    Library(String name, int yearEstablished, Book[] books) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.books = books;
    }
    void displayInfo() {
        System.out.println("The " + this.yearEstablished + " " + this.name);
        System.out.println("Books Available: ");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].displayInfo());
        }
    }
}
