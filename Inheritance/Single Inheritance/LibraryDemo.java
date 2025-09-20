// Superclass Book
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // display book details
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Author a1 = new Author(
            "The Alchemist",
            1988,
            "Paulo Coelho",
            "Brazilian lyricist and novelist, best known for 'The Alchemist'."
        );

        a1.displayInfo();
    }
}
