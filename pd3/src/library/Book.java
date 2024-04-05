package library;

public class Book extends Item {
    private String genre;
    private String ISBN;

    public Book(String title, String author, int year, String genre, String ISBN) {
        super(title, author, year);
        this.genre = genre;
        this.ISBN = ISBN;
    }

    @Override
    public void display() {
        System.out.println("Book: " + getTitle() + " | Author: " + getAuthor() + " | Year: " + getYear() +
                " | Genre: " + genre + " | ISBN: " + ISBN);
    }
}
