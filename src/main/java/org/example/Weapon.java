package org.example;

public abstract class Weapon extends Item {
    private int weaponDamage;

    public Weapon(String theNameOftheWeapon, int weapodamage) {
        super(theNameOftheWeapon,"");
        this.weaponDamage = weapodamage;
    }

    public Weapon(String theNameOftheWeapon, String description, int weapodamage) {
        super(theNameOftheWeapon,description);
        this.weaponDamage = weapodamage;
    }


    public int getDamage() {
        return weaponDamage;
    }

    public void setDamage(int weapodamage) {
        this.weaponDamage = weapodamage;
    }

    @Override
    public String toString() {
        return "\n" +"\n" + "theNameOfTheWeapon = " + getItemname() + "\n"+
                "damage =" + " " + weaponDamage + " " ;
    }
}
