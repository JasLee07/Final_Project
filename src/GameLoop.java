import java.util.Scanner;
import java.util.ArrayList;

public class gameLoop{
    
    Scanner userInput;
    ArrayList<Room> rooms;
    ArrayList<npc> npcs;
    Player player;
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
        House.addRoom(new EntryHall("Entry Hall"));
        House.addRoom(new orangeBedroom("Orange Bedroom"));
        House.addRoom(new greenBedroom("Green Bedroom"));
        House.addRoom(new purpleBedroom("Purple Bedroom", true));
        House.addRoom(new Kitchen("Blue Kitchen"));
        House.addRoom(new diningRoom("Yellow Dining Room"));
        House.addRoom(new commonRoom("Burgunday Common Room"));
        House.addnpc(new Mark());
        House.addnpc(new Bethany());
        House.addnpc(new Brian());
        House.addnpc(new Steph());
        House.addnpc(new Victim());
        System.out.println("Hello! Please enter your name:");
        String playerName = userInput.nextLine();
        new Player(playerName, "Entry Hall");
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