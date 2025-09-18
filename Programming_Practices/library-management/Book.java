package program.library_management;

public class Book extends LibraryItem implements Reservable {
    private boolean available;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String userId) {
        if (available) {
            available = false;
            System.out.println("Book reserved for UserID: " + userId);
        } else {
            System.out.println("Book not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public String toString() {
        return "Book -> " + getTitle() + " by " + getAuthor();
    }
}
