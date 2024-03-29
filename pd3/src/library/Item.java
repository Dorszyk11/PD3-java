package library;

public abstract class Item {
    String title;
    String author;
    int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void display();
}
