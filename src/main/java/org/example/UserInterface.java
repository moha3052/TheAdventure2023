package org.example;

import java.util.Scanner;

public class UserInterface {

private Adventure adventure;

    public UserInterface() {
        adventure = new Adventure();
        run();
    }
    Scanner scan = new Scanner(System.in);

    public void run (){


        System.out.println("Welcome to the adventure universe");
        System.out.println("Her is you options\n" +
                "(1) Create your own character and the game will begin\n" +
                "(2) Exit");
        String input;
        boolean keepRuning = true;
        boolean runGame;
        do {
            input = scan.nextLine();
            switch (input){
                case "1", "Create", "create" :
                    System.out.println("Create your own character and the game will begin ");
                    adventure.reName();
                    StartGame();
                    break;


                case "2","exit", "EXIT":
                    System.out.println("You have exit the game");
                    keepRuning = false;
                    break;

                default:
                    System.out.println("Try again!");
                    System.out.println("Her is you options\n" +
                            "(1) Create your own character and the game will begin \n"+
                            "(2) Exit");

            }
        } while (keepRuning);
    }
String itemName;
    public void StartGame() {
        boolean runningMainGame = true;
        do {
        System.out.println("enter a command");
        System.out.println("Enter e,w,s,n to move to a next room");
        System.out.println("You are now in room 1");
        String command=scan.nextLine();
        switch (command) {

            case "go north", "north", "n":
                adventure.move("north");
                break;


            case "go east", "east", "e":
              adventure.move("east");
                break;


            case "go west", "west", "w":
               adventure.move("west");
                break;


            case "go south", "south", "go s", "s":
                adventure.move("south");
                break;


            case "take", "t":
            System.out.println("What do you want to take");
             String item = scan.nextLine();
             adventure.pickUp(item);
             break;

            case "inventorry", "i":
                adventure.getInventory();
                break;

            case "drop", "d":
                System.out.println("What do you want to drop");
                String dropItem = scan.nextLine();
                adventure.drop(dropItem);
                System.out.println(dropItem + " is dropped");

                break;

            case "eat":
                System.out.println("What item do you want to eat");
                String eatItem = scan.nextLine();
                if (adventure.eat(eatItem)){
                    System.out.println(eatItem + " is eat");
                }
                else {
                    System.out.println(eatItem + " is not food");
                }

                break;

            case "equip", "eq":
                System.out.println("What weapon do you want to take");
                String equipweapon = scan.nextLine();
                if (adventure.equip(equipweapon)){
                    System.out.println(equipweapon + " is taken");
                    break;
                }
                else {
                    System.out.println(equipweapon + " is not a weapon");
                    break;
                }



            case "attack", "a":
                System.out.println("attack something");
                String enemyName = scan.nextLine();
                adventure.attack(enemyName);
                break;

            case "look", "l":
               adventure.look();

                break;


            case "exit", "ex":
                System.out.println("end game");
                System.exit(0);
                break;

                default:
                System.out.println(" try again");
                break;
            }
        } while(runningMainGame);

    }
}
