package org.example;
import java.util.ArrayList;
import java.util.Scanner;



public class Adventure {
    private AdventureMap map;
    private Player player;

    private Room room;

    public Adventure() {
        map = new AdventureMap();
        map.buildMap();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());


    }

    public void look(){
        player.look();
    }


    public void pickUp(String itemName){
        player.take(itemName);
    }

    public void drop(String itemName){
        player.drop(itemName);
    }


    public ArrayList<Item> getRoomItems(){
        return player.getCurrentRoom().getRoomItems();
    }
    public int getHealth(){
        return player.getHealth();
    }

    public void move(String retning){
        player.move(retning);
    }

public void getInventory(){
        player.getInventory();
}

}
