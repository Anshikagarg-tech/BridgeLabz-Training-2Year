package program.library_management;

public class DVD extends LibraryItem implements Reservable {
    private boolean available;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String userId) {
        if (available) {
            available = false;
            System.out.println("DVD reserved for UserID: " + userId);
        } else {
            System.out.println("DVD not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public String toString() {
        return "DVD -> " + getTitle() + " by " + getAuthor();
    }
}
