package Domain.Character;

import Domain.Inventory.Inventory;

public class Wizard extends Character {
    public Wizard(String name, int health, int damage, int defense, int level, Inventory inventory) {
        super(name, health, damage, defense, level, inventory);
    }
}
