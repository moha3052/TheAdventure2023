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

    public void help(){

    }

    public void reName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter player name: ");
        String name = scanner.nextLine();

        System.out.println("Enter player age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        player.setPlayerAge(age);
        player.setPlayerName(name);
    }



    public void pickUp(String itemName){
        player.take(itemName);
    }

    public void drop(String itemName){
        player.drop(itemName);
    }

    public boolean eat(String eatitem){
        return player.eat(eatitem);
    }

    public void attack(String enemyName){
        player.attack(enemyName);
    }
    public boolean equip (String equip){
        return player.equip(equip);
    }

    public String getplayerName(){
        return player.getPlayerName();
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
