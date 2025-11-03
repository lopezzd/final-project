package Domain.Inventory;

import Domain.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        System.out.println("Inventário cheio! Não é possível adicionar: " + item.getName());
        return false;
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void clear() {
        items.clear();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentSize() {
        return items.size();
    }

    public boolean isFull() {
        return items.size() >= capacity;
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("Inventário vazio.");
            return;
        }
        for (Item item : items) {
            System.out.println("- " + item.getName() + " (" + item.getDescription() + ")");
        }
    }
}

