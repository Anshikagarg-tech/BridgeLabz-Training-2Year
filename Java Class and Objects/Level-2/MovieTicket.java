package program.basics;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Ticket booked for movie: " + movieName + ", Seat No: " + seatNumber + ", Price: " + price);
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Inception", 15, 250);
        t1.bookTicket();
        t1.displayTicketDetails();
    }
}
