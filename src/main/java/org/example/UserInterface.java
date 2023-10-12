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


                case "3","exit", "EXIT":
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
        boolean startruning = false;
        do {

            System.out.println("\n-------------------------------------------");
            System.out.println("enter a command");


        if (!startruning){
            System.out.println("Enter e,w,s,n to move to a next room");
            System.out.println("Enter help or h, to get help");
            System.out.println();
            System.out.println(adventure.getplayerName() + " is now in room 1");
            System.out.println("\n-------------------------------------------");

        } startruning = true;

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

            case "help", "h":
                System.out.println("Her is you options:");
                System.out.println();
                getHelp();
                break;

            case "take", "t":
            System.out.println("What do you want to take");
             String item = scan.nextLine();
             adventure.pickUp(item);
             break;

            case "inventory", "i":
                adventure.getInventory();
                break;

            case "drop", "d":
                System.out.println("What do you want to drop");
                String dropItem = scan.nextLine();
                adventure.drop(dropItem);
                System.out.println(dropItem + " is dropped");

                break;

            case "eat":
                System.out.println("What food do you want to eat");
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

            case "health", "he":
                System.out.println(adventure.getHealth());
                break;


                default:
                System.out.println(" try again");
                break;
            }
        } while(runningMainGame);

    }

    public void getHelp(){
        System.out.println("Enter e, w , s , n to move to a next room");
        System.out.println();
        System.out.println("Enter look or l, to look around the room");
        System.out.println();
        System.out.println("Enter eat, to eat the food you have in you inventory");
        System.out.println();
        System.out.println("Enter i, to look in you inventory");
        System.out.println();
        System.out.println("Enter drop or d, to drop a item or food");
        System.out.println();
        System.out.println("Enter equip or eq, to equip a weapon you want to have");
        System.out.println();
        System.out.println("Enter a, to attack somebody");
        System.out.println();
        System.out.println("Enter exit or ex to end the game");
        System.out.println();
        System.out.println("\n-------------------------------------------");
    }
}
