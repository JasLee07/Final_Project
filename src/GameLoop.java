import java.util.Scanner;
import java.util.ArrayList;

public class gameLoop{
    
    Scanner userInput;
    ArrayList<Room> rooms;
    ArrayList<npc> npcs;
    player player;
    boolean isRunning;


    public gameLoop(){
        rooms = new ArrayList<Room>();
        userInput = new Scanner(System.in);
        npcs = new ArrayList<npc>();
        this.isRunning = true;
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    public void addnpc(npc n){
    npcs.add(n);
}

    public void setup(){
        gameLoop House = new gameLoop();
        House.addRoom(new entryHall("Entry Hall"));
        House.addRoom(new orangeBedroom("Orange Bedroom"));
        House.addRoom(new greenBedroom("Green Bedroom"));
        House.addRoom(new purpleBedroom("Purple Bedroom", true));
        House.addRoom(new kitchen("Blue Kitchen"));
        House.addRoom(new diningRoom("Yellow Dining Room"));
        House.addRoom(new commonRoom("Burgunday Common Room"));
        House.addnpc(new mark());
        House.addnpc(new bethany());
        House.addnpc(new brian());
        House.addnpc(new steph());
        House.addnpc(new victim());
        System.out.println("Hello! Please enter your name:");
        String playerName = userInput.nextLine();
        new player(playerName, "Entry Hall");
    }

    public void showOptions(){

    }

    public void takeTurn(){

    }
    @Override
    public String toString(){
        String roomString = "Here are a list of rooms you can go to!";
        for(int i = 0; i < this.rooms.size(); i++){
            roomString += "\n  " + (i+1) + ". "+ this.rooms.get(i);
        }
        return roomString;
    }

}