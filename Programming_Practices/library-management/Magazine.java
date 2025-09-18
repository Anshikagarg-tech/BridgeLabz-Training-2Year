package program.library_management;

public class Magazine extends LibraryItem implements Reservable {
    private boolean available;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String userId) {
        if (available) {
            available = false;
            System.out.println("Magazine reserved for UserID: " + userId);
        } else {
            System.out.println("Magazine not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public String toString() {
        return "Magazine -> " + getTitle() + " by " + getAuthor();
    }
}
