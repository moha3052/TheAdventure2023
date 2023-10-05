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
                "(1) start game\n" +
                "(2) Exit");
        String input;
        boolean keepRuning;
        boolean runGame;
        do {
            input = scan.nextLine();
            switch (input){
                case "1","start":
                    System.out.println("Enter e,w,s,n to move to a next room");

                    keepRuning = true;

                    //det her er hvor spillet kører
                    runGame = true;
                    while(runGame) {
                        StartGame();
                    }

                    break;
                case "2","exit":
                    System.out.println("You have exit the game");
                    keepRuning = false;
                    break;

                default:
                    System.out.println("Try again!");
                    System.out.println("Her is you options\n" +
                            "(1) start game\n" +
                            "(2) Exit");
                    keepRuning = true;
            }
        } while (keepRuning);
    }
String itemName;
    public void StartGame() {
        System.out.println("enter a command");
        String command=scan.nextLine();
        switch (command) {

            case "go north", "n":
                adventure.move("north");
                break;


            case "go east", "e":
              adventure.move("east");
                break;


            case "go west", "w":
               adventure.move("west");
                break;


            case "go south", "s":
                adventure.move("south");
                break;


            case "Take", "t":
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

    }
}
