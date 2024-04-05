package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library implements LibraryActions {
    private final List<Item> items = new ArrayList<>();
    private final Map<Integer, User> users = new HashMap<>();
    private final Map<Item, User> checkedOutItems = new HashMap<>();

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void checkoutItem(int userId, Item item) {
        if (!item.isCheckedOut() && users.containsKey(userId)) {
            item.setCheckedOut(true);
            checkedOutItems.put(item, users.get(userId));
            System.out.println(item.getTitle() + " has been checked out to " + users.get(userId).getName() + ".");
        } else {
            System.out.println("Item is already checked out or user does not exist.");
        }
    }

    public void returnItem(Item item) {
        if (item.isCheckedOut()) {
            item.setCheckedOut(false);
            checkedOutItems.remove(item);
            System.out.println(item.getTitle() + " has been returned.");
        } else {
            System.out.println("This item was not checked out.");
        }
    }

    @Override
    public void displayItems() {
        for (Item item : items) {
            item.display();
            if (item.isCheckedOut()) {
                User user = checkedOutItems.get(item);
                System.out.println(" - Checked out to " + user.getName());
            }
        }
    }
    public Item findItemByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null; // jeśli nie znajdziemy przedmiotu, zwracamy null
    }
}
