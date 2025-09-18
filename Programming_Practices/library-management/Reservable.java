package program.library_management;

public interface Reservable {
    void reserveItem(String userId);
    boolean checkAvailability();
}
