import java.util.ArrayList;

// Book class (can exist independently of Library)
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}

// Library class (aggregates books)
class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        // Books created independently
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Java Programming", "James Gosling");

        // Libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books (same book can be in multiple libraries)
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        // Display
        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
