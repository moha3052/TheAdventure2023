package org.example;

public class Weapon extends Item {


    public Weapon(String name, String Thenameoftheweapon) {
        super(name, Thenameoftheweapon);
    }

    @Override
    public String toString() {
        return "TheNameoftheWeapon" +
                "edible=" + edible +
                '}';
    }
}
