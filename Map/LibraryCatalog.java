import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("978-1111111111", "Java Programming");
        books.put("978-2222222222", "Python Basics");
        books.put("978-3333333333", "Data Structures");

        // Search by ISBN
        String isbn = "978-2222222222";
        System.out.println("Book: " + books.getOrDefault(isbn, "Book not found"));

        // Remove a book
        books.remove("978-3333333333");

        // Print all sorted by ISBN
        System.out.println("\nBooks:");
        for (String key : books.keySet())
            System.out.println(key + " -> " + books.get(key));

        // Search by title
        String title = "Java Programming";
        boolean found = false;
        for (Map.Entry<String, String> e : books.entrySet()) {
            if (e.getValue().equalsIgnoreCase(title)) {
                System.out.println("\nFound by title: " + e.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("Book not found");
    }
}
