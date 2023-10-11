package org.example;

public abstract class Weapon extends Item {
    private int weapodamage;

    public Weapon(String theNameOftheWeapon, int weapodamage) {
        super(theNameOftheWeapon,"");
        this.weapodamage = weapodamage;
    }

    public Weapon(String theNameOftheWeapon, String description, int weapodamage) {
        super(theNameOftheWeapon,description);
        this.weapodamage = weapodamage;
    }


    public int getDamage() {
        return weapodamage;
    }

    public void setDamage(int weapodamage) {
        this.weapodamage = weapodamage;
    }

    @Override
    public String toString() {
        return "\n" +"\n" + "theNameOfTheWeapon = " + getItemname() + "\n"+
                "damage =" + " " + weapodamage + " " ;
    }
}
