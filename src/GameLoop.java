import java.util.Scanner;
import java.util.ArrayList;

public class gameLoop{
    
    Scanner userInput;
    ArrayList<room> rooms;
    ArrayList<npc> npcs;
    player player;
    boolean isRunning;


    public gameLoop(){
        rooms = new ArrayList<room>();
        userInput = new Scanner(System.in);
        npcs = new ArrayList<npc>();
        this.isRunning = true;
    }

    public void addRoom(room r){
        rooms.add(r);
    }

    public void addnpc(npc n){
    npcs.add(n);
}

    public void setup(){
        addRoom(new entryHall("Entry Hall"));
        addRoom(new orangeBedroom("Orange Bedroom"));
        addRoom(new greenBedroom("Green Bedroom"));
        addRoom(new purpleBedroom("Purple Bedroom", true));
        addRoom(new kitchen("Blue Kitchen"));
        addRoom(new diningRoom("Yellow Dining Room"));
        addRoom(new commonRoom("Burgunday Common Room"));
        addnpc(new mark());
        addnpc(new bethany());
        addnpc(new brian());
        addnpc(new steph());
        addnpc(new victim());
        System.out.println("Hello! Please enter your name:");
        String playerName = userInput.nextLine();
        player = new player(playerName, "Entry Hall");
    }

    public void showOptions(){
        System.out.println("Move to room");
        System.out.println("Inspect room");
        System.out.println("Talk to someone");
        System.out.println("Check inventory");
        System.out.println("Quit");
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