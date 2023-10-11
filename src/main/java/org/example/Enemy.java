package org.example;

public class Enemy {

    private String nameOfTheEnemy;

    private String descriptionOfTheEnemy;

    private Weapon enemyWeapon;
    private int enemyHealthPoints;

    public void setNameOfTheEnemy(String nameOfTheEnemy) {
        this.nameOfTheEnemy = nameOfTheEnemy;
    }

    public void setDescriptionOfTheEnemy(String descriptionOfTheEnemy) {
        this.descriptionOfTheEnemy = descriptionOfTheEnemy;
    }

    public void setEnemyWeapon(Weapon enemyWeapon) {
        this.enemyWeapon = enemyWeapon;
    }

    public void setEnemyHealthPoints(int enemyHealthPoints) {
        this.enemyHealthPoints = enemyHealthPoints;
    }

    public Enemy(String nameOfTheEnemy, String descriptionOfTheEnemy, int enemyHealthPoints, Weapon enemyWeapon) {
            this.nameOfTheEnemy = nameOfTheEnemy;
            this.descriptionOfTheEnemy = descriptionOfTheEnemy;
            this.enemyWeapon = enemyWeapon;
            this.enemyHealthPoints = enemyHealthPoints;
        }

        public String getnameOfTheEnemy(){
            return nameOfTheEnemy;
        }

        public String getDescriptionOfTheEnemy(){
            return descriptionOfTheEnemy;
        }

        public Weapon getEnemyWeapon(){
            return enemyWeapon;
        }

        public int getenemyHealthPoints(){
            return enemyHealthPoints;
        }



        public String toString(){
            return "\n"+ "NameOfTheEnemy:"+ " " + nameOfTheEnemy +
                    "\n"+"DescriptionOfTheEnemy:"+ " " + descriptionOfTheEnemy +
                    "\n" +"Weapon Name"+ " "+ getEnemyWeapon() +
                    "\n"+ "EnemyHealthPoints:" +" "+ enemyHealthPoints;
        }



}
