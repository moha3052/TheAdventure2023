package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Player {
    private AdventureMap map;
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health = 50;
    private Weapon equip;

    private String playerName;
    private int playerAge;




    public void move(String retning){
        Room nextRoom = getroom(retning);
        if (nextRoom!=null){
            currentRoom = nextRoom;
            System.out.println(playerName + " is going "+ retning + " and are now in " + currentRoom.getName());

        }
        else {
            System.out.println("you cannot go that way");
        }
    }

    public Room getroom(String retning) {
        switch (retning) {
            case "north" -> {
                return currentRoom.getNorth();}
            case "east" ->{
                return currentRoom.getEast();}
            case "west" -> {
                return currentRoom.getWest();}
            case "south" -> { return currentRoom.getSouth();}
            default -> {return null;}
        }
    }

    public Player() {
        inventory = new ArrayList<>();
        map = new AdventureMap();
        currentRoom = map.getRoom1();
        this.playerName = "";
        this.playerAge = 0;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName(String playerName){
        return playerName;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void take(String itemName) {
        Item found = null;
        for (Item item : currentRoom.getRoomItems())
            if (item.getItemname().equals(itemName)) {
                inventory.add(item);
                found = item;

                break;
            }
        currentRoom.getRoomItems().remove(found);
        System.out.println(currentRoom.getRoomEnemies());

    }

    public void drop(String itemName) {
        Item found = null;
        for (Item item : inventory) {
            if (item.getItemname().equalsIgnoreCase(itemName)) {
                found = item;
                break;
            }
        }
        if (found != null) {
            inventory.remove(found);
            currentRoom.getRoomItems().add(found);
        }
    }



    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public void getInventory() {
        if (inventory!=null)
            System.out.println(inventory);
        else System.out.println("inventory is empty");
    }


    public void moveNorth() {
        if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
        }
    }


    public void moveSouth() {
        if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
        }
    }

    public void moveEast() {
        if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
        }
    }

    public void moveWest() {
        if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
        }
    }

    public void setHealth(int health){
        this.health = health;
    }

    public String getCurrentRoomName() {
        return currentRoom.getName();
    }
    public void look(){
        System.out.println(currentRoom.getName()+ "\n" +currentRoom.getDescription());
        for (Item i : currentRoom.getRoomItems()) {
            System.out.println(i);
        }
        for (Enemy e : currentRoom.getRoomEnemies()) {
            System.out.println(e);
        }

    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public int getHealth() {
        return health;
    }
    public String getPlayerName(){
        return playerName;
    }


        public boolean eat(String itemName) {
            Food found = null;
            for (Item item : inventory) {
                if (item.getItemname().equalsIgnoreCase(itemName)) {
                    if (item.isEdible()){ // item instanceof Food
                        found = (Food) item;
                    }
                }
            }
            if (found != null) {
                health += found.getHealthPoints();
                inventory.remove(found);
                return true;
            }
            return false;
        }

    public void attack (String enemyName) {
        Enemy enemy = currentRoom.findEnemy(enemyName);

        if (equip == null){
            System.out.println("you don´t have a weapon");


        } else {
         enemy.setEnemyHealthPoints(enemy.getenemyHealthPoints()-equip.getDamage());
            System.out.println();
            System.out.println("enemy get hit by " + playerName);
            System.out.println();
            System.out.println("enemy health " + enemy.getenemyHealthPoints());
            System.out.println();
         setHealth(health-enemy.getEnemyWeapon().getDamage());

            System.out.println(playerName+ " health is " + getHealth());
            System.out.println();
            System.out.println("you got hit by " + enemy.getnameOfTheEnemy());

        }
        if (enemy.isDead()){
            System.out.println();
            System.out.println("You killed the enemy ");
            currentRoom.getRoomItems().add(enemy.getEnemyWeapon());
            currentRoom.getRoomEnemies().remove(enemy);
        }



    }


    public boolean equip(String itemName) {
        Item found = null;
        for (Item item : inventory) {
            if (item.getItemname().equalsIgnoreCase(itemName)) {
                if (item instanceof Weapon) {
                    found = item;
                    equip = (Weapon) found;
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Player" +
                "\n"+ "map = " + map +
                "\n"+ " currentRoom = " + currentRoom +
                "\n"+ "inventory = " + inventory +
                "\n"+ " health = " + health +
                "\n"+ "equip = " + equip;
    }
}
