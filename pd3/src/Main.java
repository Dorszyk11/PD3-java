import library.Book;
import library.Library;
import library.Magazine;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book GownoKsiazkaXDDD = new Book("Jak zostać szachistą XXI wieku? Kompendium wiedzy dla początkujących", "Aleksander Radomski",
                2020, "chess", "9788395656408");
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", 2020, 1);

        library.addItem(GownoKsiazkaXDDD);
        library.addItem(magazine1);

        library.displayItems();
    }
}
