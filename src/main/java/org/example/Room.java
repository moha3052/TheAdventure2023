package org.example;

import java.util.ArrayList;

public class Room {

    private String name;
    private String theNameOfTheRoom;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;
    private Room room;


    private ArrayList<Item> roomItems = new ArrayList<Item>();

    public Room(String name, String description, String theNameOfTheRoom) {
        this.name = name;
        this.description = description;
        this.theNameOfTheRoom = theNameOfTheRoom;
    }

    public Room getroom(String retning) {
        switch (retning) {
            case "north":
                return north;
            case "east":
                return east;
            case "west":
                return west;
            case "go south", "s":
                return south;
            default:
                return null;
        }
    }



    public String getName() {
        return name;
    }
    public String getTheNameOfTheRoom() {
        return theNameOfTheRoom;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }


    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTheNameOfTheRoom(String theNameOfTheRoom) {
        this.theNameOfTheRoom = theNameOfTheRoom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public void setSouth(Room south) {
        this.south = south;
    }



    @Override
    public String toString() {
        return "Room " + description+ "description "+ '\'' +
                 "name =" + name + '\'';

    }

    public ArrayList<Item> getRoomItems(){
        return roomItems;
    }

    public void addItem(String name, String description){
        roomItems.add(new Item(name, description));
    }

    public void addfood(String name, String description, int healthpoints){
        roomItems.add(new Food(name, description, healthpoints));
    }

}
