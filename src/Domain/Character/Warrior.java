package Domain.Character;

import Domain.Inventory.Inventory;

public class Warrior extends Character {
    public Warrior(String name, int health, int damage, int defense, int level, Inventory inventory) {
        super(name, health, damage, defense, level, inventory);
    }
}
