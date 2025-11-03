package Domain.Character;

import Domain.Inventory.Inventory;

public abstract class Character {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int level;
    private Inventory inventory;

    public Character(String name, int health, int damage, int defense, int level, Inventory inventory) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.level = level;
        this.inventory = inventory;
    }
}
