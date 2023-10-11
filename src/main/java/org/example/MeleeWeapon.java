package org.example;
public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String weaponName, int weaponDamage){
        super(weaponName, weaponDamage);
    }

    public MeleeWeapon(String theNameOftheWeapon, String description, int weapodamage) {
        super(theNameOftheWeapon, description, weapodamage);
    }

    public int remainingUses(){
        return 0;
    }

    public int remainingAmmo(){
        return remainingUses();
    }

    @Override
    public String toString(){
        return "\n\nWeapon Name: "+super.getItemname()+

                "\nDamage: "+getDamage();
    }


}


