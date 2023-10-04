package org.example;

public class AdventureMap {
    private Room starterRoom;
    public Room currentRoom;
    private Player player;
    private org.example.Room room1, room2, room3, room4, room5, room6, room7, room8,room9;




    public void buildMap(){
        room1 = new org.example.Room("Room 1", "In this chilling room, disembodied whispers and ghostly apparitions roam freely, sharing secrets from the afterlife.", "The Whispering Parlor");
        room1.addItem("flashlight", "use to light up the room");
        room1.addfood("apple", "can increase your health with 20 after consumption", 20);


        room2 = new org.example.Room("Room 2", "An old library filled with ethereal books that levitate and pages that turn on their own, where a ghostly scholar forever seeks elusive knowledge", "The Spectral Study");
        room2.addItem("Book", "an old duty tome filled with arcane knowledge");
        room2.addfood("wine", "a vintage wine that restores your health", 30);


        room3 = new org.example.Room("Room 3", "This elegant chamber is trapped in time, hosting spectral masquerades with phantom dancers who waltz through the ages.", "The Haunted Ballroom");
        room3.addItem("potion", "a mysterious potion with unknown effects");
        room3.addfood("bread", "a loaf of bread that restores your health", 25);

        room4 = new org.example.Room("Room 4", "Filled with antique toys and echoing with the laughter of ghostly children, this room hides a tragic history that still haunts its walls.", "The Cursed Nursery");
        room4.addItem("teddy bear", "an old, cuddly teddy bear");
        room4.addfood("candy", "sweets that restore your health", 15);


        room5 = new org.example.Room("Room 5", "Deep beneath the manor lies a crypt filled with ominous shadows and restless spirits, where eerie whispers echo through the cold stone walls.", "The Shadowed Crypt");
        room5.addItem("crypt key", "a key that unlocks the crypt door");
        room5.addfood("blood orange", "a rare fruit that restores your health", 35);


        room6 = new org.example.Room("Room 6", "A place of dark experiments and unspeakable horrors, where lingering apparitions guard the sinister secrets of their former mad scientist.", "The Forbidden Laboratory");
        room6.addItem("test tube", "a mysterious test tube filled with liquid");
        room6.addfood("cookie", "a cookie that restores your health", 10);


        room7 = new org.example.Room("Room 7", "This room is inhabited by a vengeful spirit, known as the \"Lady in White,\" who weeps eternally, leaving behind tear-stained mirrors and chilling cold spots.", "The Phantom's Chamber");
        room7.addItem("mirror shard", "a shard from a broken mirror");
        room7.addfood("ghostly elixir", "an elixir that restores your health", 40);


        room8 = new org.example.Room("Room 8", "Hidden away at the top of the house, this attic is a realm of perpetual twilight, inhabited by a mischievous poltergeist who delights in moving objects and casting eerie silhouettes.", "The Twilight Attic");
        room8.addItem("old photograph", "a faded photograph of a family");
        room8.addfood("stale bread", "bread that restores your health", 20);


        room9 = new org.example.Room("Room 9", "A room of sorrow and despair, where the anguished moans of lingering souls mix with the scent of embalming fluid, creating an eerie and unsettling atmosphere.", "The Melancholy Morgue");
        room9.addItem("embalming fluid", "a bottle of embalming fluid");
        room9.addfood("rotten apple", "an apple that restores your health", 5);


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

        currentRoom = room1;

    }

public Room getStarterRoom(){
        return starterRoom=room1;
}
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

    public Room getRoom3() {
        return room3;
    }

    public void setRoom3(Room room3) {
        this.room3 = room3;
    }

    public Room getRoom4() {
        return room4;
    }

    public void setRoom4(Room room4) {
        this.room4 = room4;
    }

    public Room getRoom5() {
        return room5;
    }

    public void setRoom5(Room room5) {
        this.room5 = room5;
    }

    public Room getRoom6() {
        return room6;
    }

    public void setRoom6(Room room6) {
        this.room6 = room6;
    }

    public Room getRoom7() {
        return room7;
    }

    public void setRoom7(Room room7) {
        this.room7 = room7;
    }

    public Room getRoom8() {
        return room8;
    }

    public void setRoom8(Room room8) {
        this.room8 = room8;
    }

    public Room getRoom9() {
        return room9;
    }

    public void setRoom9(Room room9) {
        this.room9 = room9;
    }



}
