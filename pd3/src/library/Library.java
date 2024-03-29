package library;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryActions {
    private final List<Item> items = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void displayItems() {
        for (Item item : items) {
            item.display();
        }
    }
}
