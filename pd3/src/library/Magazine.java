package library;

public class Magazine extends Item {

    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void display() {
        System.out.println("Magazine: " + getTitle() + " | Author: " + getAuthor() + " | Year: " + getYear() + " | Issue: " + issueNumber);
    }
}