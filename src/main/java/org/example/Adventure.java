package org.example;

import java.util.Scanner;

public class Adventure {

    Room currentRoom;

    public static void main(String[] args) {

        Adventure game = new Adventure();
        AdventureMap map = new AdventureMap();
        map.Createrooms();

        game.currentRoom = map.getRoom1();



        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the adventure universe");
        System.out.println("Her is you options\n" +
                           "(1) start game\n" +
                           "(2) Exit");
        int input = scan.nextInt();

        boolean keepRuning;

        switch (input){
            case 1:
                System.out.println("Enter e,w,s,n to move to a next room");
                keepRuning = true;
                break;
            case 2:
                System.out.println("You have exit the game");
                keepRuning = false;
                break;

            default:
                keepRuning = false;

        }


        while (keepRuning) {
            String retning = scan.nextLine();

            game.move(retning);

        }
    }

    public void move(String retning) {
        switch (retning) {
            case "go north", "n":
                if (currentRoom.getNorth() != null) {
                    currentRoom = currentRoom.getNorth();
                    System.out.println("You are now in" + " " + currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                } else {
                    System.out.println("You can not go this way.");
                }
                break;

            case "go east", "e":
                if (currentRoom.getEast() != null) {
                    currentRoom = currentRoom.getEast();
                    System.out.println("You are now in" + " " + currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                } else {
                    System.out.println("You can not go this way.");
                }
                break;


            case "go west", "w":
                if (currentRoom.getWest() != null) {
                    currentRoom = currentRoom.getWest();
                    System.out.println("You are now in" + " " + currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                } else {
                    System.out.println("You can not go this way.");
                }
                break;


            case "go south", "s":
                if (currentRoom.getSouth() != null) {
                    currentRoom = currentRoom.getSouth();
                    System.out.println("You are now in" + " " + currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                } else {
                    System.out.println("You can not go this way.");
                }
                break;

            case "look":
                System.out.println("You are now in" + " " + currentRoom.getName());
                System.out.println(currentRoom.getDescription());
                break;

                default:

                break;
        }


    }
}

