import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        org.example.Adventure adventure = new org.example.Adventure();
        adventure.setConnections();
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcommen to the adventure univers");
        System.out.println("You are in room1");

        while (true) {
            String retning = scan.nextLine();

            adventure.move(retning);

        }
    }
}

