package program.samples;

public class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn; // final
        this.title = title; // this
        this.author = author; // this
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("ISBN101", "Java Basics", "James Gosling");
        Book.displayLibraryName();
        b1.displayBookDetails();
    }
}
