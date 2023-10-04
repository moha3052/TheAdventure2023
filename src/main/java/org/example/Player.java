package org.example;

import java.util.ArrayList;

public class Player {
    private AdventureMap map;
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health = 50;


    public void move(String retning){
        Room nextRoom = currentRoom.getroom(retning);
        if (nextRoom!=null){
            currentRoom=nextRoom;
            System.out.println(currentRoom.getName()+
                    "\n"+ "going"+" "+ retning);
        }
        else {
            System.out.println("you cannot go that way");
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
            if (item.getName().equals(itemName)) {
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


}
