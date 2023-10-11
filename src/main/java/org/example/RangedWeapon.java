package org.example;

public class RangedWeapon extends Weapon {

    private int weaponAmmo;

    public RangedWeapon(String weaponname, int weaponDamage, int weaponAmmo){
        super(weaponname, weaponDamage);
        this.weaponAmmo = weaponAmmo;
    }

    public RangedWeapon(String theNameOftheWeapon, String description, int weapondamage, int weaponAmmo) {
        super(theNameOftheWeapon, description, weapondamage);
        this.weaponAmmo = weaponAmmo;
    }

    public void setWeaponAmo(int weaponAmmo) {
        this.weaponAmmo = weaponAmmo;
    }


    public int getWeaponAmmo() {
        return weaponAmmo;
    }


    public int remainingUses(){
        return weaponAmmo;
    }

    @Override
    public String toString(){
        return "\n\nWeapon Name: "+super.getItemname()+

                "\nDamage: "+getDamage()+
                "\nAmmo: "+getWeaponAmmo();
    }
}
