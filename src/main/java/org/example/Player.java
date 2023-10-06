package org.example;

import java.util.ArrayList;

public class Player {
    private AdventureMap map;
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health = 50;


    public void move(String retning){
        Room nextRoom = getroom(retning);
        if (nextRoom!=null){
            currentRoom = nextRoom;
            System.out.println(currentRoom.getName()+ "\n"+ "going"+" "+ retning);
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
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void take(String itemName) {
        Item found = null;
        for (Item item : currentRoom.getRoomItems())
            if (item.getName().equals(itemName)) {
                inventory.add(item);
                found = item;
                break;
            }
        currentRoom.getRoomItems().remove(found);

    }

    public void drop(String itemName) {
        Item found = null;
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
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

    public String getCurrentRoomName() {
        return currentRoom.getName();
    }
    public void look(){
        System.out.println(currentRoom.getName()+ " " +currentRoom.getDescription()+ " "
                +currentRoom.getTheNameOfTheRoom()+" "
                +currentRoom.getRoomItems());
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public int getHealth() {
        return health;
    }


        public boolean eat(String itemName) {
            Food found = null;
            for (Item item : inventory) {
                if (item.getName().equalsIgnoreCase(itemName)) {
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

    public void attack (String itemName) {
        Item found = null;
        for (Item item : inventory) {
            if (item instanceof Weapon) {
                found = item;
                break;
            }
        }
        if (found != null) {
            inventory.remove(found);
            currentRoom.getRoomItems().add(found);
        }
    }

}
