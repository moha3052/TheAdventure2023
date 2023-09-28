package org.example;

import java.util.Scanner;

public class Adventure {

    private org.example.Room room1;
    private org.example.Room room2;
    private org.example.Room room3;
    private org.example.Room room4;
    private org.example.Room room5;
    private org.example.Room room6;
    private org.example.Room room7;
    private org.example.Room room8;
    private org.example.Room room9;

    private org.example.Room currentRoom;

    private org.example.Room startroom;


    public void setConnections(){
        room1 = new org.example.Room("Room1", "up West corner");
        room2 = new org.example.Room("Room2", "Middle up");
        room3 = new org.example.Room("Room3", "up East corner");
        room4 = new org.example.Room("Room4", "middle West corner");
        room5 = new org.example.Room("Room5", "middle East corner");
        room6 = new org.example.Room("Room6", "middle East corner");
        room7 = new org.example.Room("Room7", "down west corner");
        room8 = new org.example.Room("Room8", "Down Middle corner");
        room9 = new org.example.Room("Room9", "Down East corner");
        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setSouth(room7);
        room4.setNorth(room1);
        room5.setSouth(room8);
        room6.setSouth(room9);
        room6.setNorth(room3);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);
        startroom = room1;
        currentRoom = startroom;
    }

    public void move(String retning){
        switch (retning){
            case "go north", "n":
                if (currentRoom.getNorth()==null){
                    System.out.println("Det kan ikke være muligt");
                    break;
                }
                currentRoom = currentRoom.getNorth();
                System.out.println(currentRoom.getDescription()+ " "+ currentRoom.getName());
                break;
            case "go east", "e":
                if (currentRoom.getEast() == null){
                    System.out.println("Det kan ikke være muligt");
                    break;
                }
                currentRoom = currentRoom.getEast();
                System.out.println(currentRoom.getDescription()+ " "+ currentRoom.getName());

                break;
            case "go west", "w":
                if (currentRoom.getWest() == null){
                    System.out.println("Det kan ikke være muligt");
                    break;
                }
                currentRoom = currentRoom.getWest();
                System.out.println(currentRoom.getDescription()+ " "+ currentRoom.getName());
                break;

            case "go south", "s":
                if (currentRoom.getSouth() == null){
                    System.out.println("Det kan ikke være muligt");
                    break;
                }

                currentRoom = currentRoom.getSouth();
                System.out.println(currentRoom.getDescription()+ " "+ currentRoom.getName());
                break;

            case "look":
                System.out.println(currentRoom.getDescription() + " " + currentRoom.getName());
            default:
                System.out.println("nothing to find");


        }
    }
}
