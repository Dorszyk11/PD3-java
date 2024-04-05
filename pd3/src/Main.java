import library.Book;
import library.Library;
import library.Magazine;
import library.User;
import library.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addUser(new User("Bartosz Rudecki", 1));
        library.addUser(new User("Hikaru Nakamura", 2));
        Book GownoKsiazkaXDDD = new Book("Jak zostać szachistą XXI wieku? Kompendium wiedzy dla początkujących", "Aleksander Radomski", 2020, "chess", "9788395656408");
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel", "1234567890");
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", 2020, 1);
        library.addItem(book1);
        library.addItem(GownoKsiazkaXDDD);
        library.addItem(magazine1);

        String userInput;
        do {
            System.out.println("Dostępne komendy: wypozycz, zwroc, wyswietl, wyjdz");
            System.out.print("Wpisz komendę: ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "wypozycz":
                    System.out.print("Wpisz ID użytkownika: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Wpisz tytuł książki: ");
                    String bookTitle = scanner.nextLine();
                    Item itemToCheckout = library.findItemByTitle(bookTitle);
                    if (itemToCheckout != null) {
                        library.checkoutItem(userId, itemToCheckout);
                    } else {
                        System.out.println("Książka nie znaleziona.");
                    }
                    break;
                case "zwroc":
                    System.out.print("Wpisz tytuł książki do zwrotu: ");
                    String bookToReturnTitle = scanner.nextLine();
                    Item itemToReturn = library.findItemByTitle(bookToReturnTitle);
                    if (itemToReturn != null) {
                        library.returnItem(itemToReturn);
                    } else {
                        System.out.println("Książka nie znaleziona.");
                    }
                    break;
                case "wyswietl":
                    library.displayItems();
                    break;
                case "wyjdz":
                    System.out.println("Zamykanie programu.");
                    break;
                default:
                    System.out.println("Nieznana komenda.");
                    break;
            }
        } while (!userInput.equals("wyjdz"));

        scanner.close();
    }
}
