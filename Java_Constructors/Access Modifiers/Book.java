package program.practice;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + format);
    }
}

class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book("B101", "Java Basics", "James Gosling");
        b1.displayBookDetails();

        EBook eb = new EBook("EB201", "Advanced Java", "Rohit Sharma", "PDF");
        eb.displayEBookDetails();
    }
}
