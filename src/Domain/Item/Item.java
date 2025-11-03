package Domain.Item;

import java.util.Objects;

public abstract class Item implements Comparable <Item>{
    private String name;
    private String description;
    private Effect effect;
    private int quantity;

    public Item(String name, String description, Effect effect, int quantity) {
        setName(name);
        setDescription(description);
        setEffect(effect);
        setQuantity(quantity);
    }

    public Item(Item item){
        if (item == null) {
            throw new IllegalArgumentException("O item não pode ser nulo.");
        }

        this.name = item.name;
        this.description = item.description;
        this.effect = item.effect;
        this.quantity = item.quantity;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Effect getEffect() { return effect; }

    public int getQuantity() { return quantity; }

    public void setName(String name) {
        this.name = name;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity){
        if(quantity < 1)
            throw new IllegalArgumentException("");

        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", effect=" + effect +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity && Objects.equals(name, item.name) && Objects.equals(description, item.description) && effect == item.effect;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, effect, quantity);
    }

    public int compareTo(Item item){
        int compareName = this.name.compareTo(item.getName());
        int compareEffect = this.effect.compareTo(item.getEffect());

        if (compareName != 0) return compareName;
        if (compareEffect != 0) return compareEffect;

        return 0;
    }
}
