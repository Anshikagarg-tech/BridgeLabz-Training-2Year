package program.library_management;

public class Main {
    public static void main(String[] args) {
        LibraryItem b1 = new Book("B101", "Java Fundamentals", "James Gosling");
        LibraryItem m1 = new Magazine("M201", "Tech Monthly", "Tech Media");
        LibraryItem d1 = new DVD("D301", "OOP Concepts", "Educational Films");

        // Display details
        b1.getItemDetails();
        m1.getItemDetails();
        d1.getItemDetails();

        // Polymorphism with loan duration
        System.out.println(b1 + " | Loan Duration: " + b1.getLoanDuration() + " days");
        System.out.println(m1 + " | Loan Duration: " + m1.getLoanDuration() + " days");
        System.out.println(d1 + " | Loan Duration: " + d1.getLoanDuration() + " days");

        // Reservations
        Reservable r1 = (Reservable) b1;
        Reservable r2 = (Reservable) m1;
        Reservable r3 = (Reservable) d1;

        r1.reserveItem("U1001");
        r2.reserveItem("U1002");
        r3.reserveItem("U1003");

        System.out.println("Book availability: " + r1.checkAvailability());
        System.out.println("Magazine availability: " + r2.checkAvailability());
        System.out.println("DVD availability: " + r3.checkAvailability());
    }
}
