package library;

public class Book extends Item {
    String genre;
    String ISBN;

    public Book(String title, String author, int year, String genre, String ISBN) {
        super(title, author, year);
        this.genre = genre;
        this.ISBN = ISBN;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " | Author: " + author + " | Year: " + year + " | Genre: " + genre + " | ISBN: " + ISBN);
    }
}
