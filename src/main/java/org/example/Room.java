package org.example;

public class Room {

    private String name;
    private String theNameOfTheRoom;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String name, String description, String theNameOfTheRoom){
        this.name = name;
        this.description = description;
        this.theNameOfTheRoom = theNameOfTheRoom;
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

    public void setSouth(Room south) {
        this.south = south;
    }

    @Override
    public String toString() {
        return "Room{"
                + "name='"  + name + '\'' +
                ", description='" + description + '\'';
    }

}