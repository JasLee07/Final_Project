import java.util.Scanner;
import java.util.ArrayList;

public class GameLoop{
    
    Scanner userInput;
    ArrayList<Room> rooms;
    ArrayList<NPC> npcs;
    Player player;
    boolean isRunning;


    public GameLoop(){
        rooms = new ArrayList<Room>();
        userInput = new Scanner(System.in);
        npcs = new ArrayList<NPC>();
        player = new Player(null, 0, null);
        this.isRunning = true;
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    public void setup(Player player){

    }

    public String showOptions(){

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

    public static void main(String[] args) {
        GameLoop House = new GameLoop();
        House.addRoom(new EntryHall("Entry Hall"));
        House.addRoom(new OrangeBedroom("Orange Bedroom"));
        House.addRoom(new GreenBedroom("Green Bedroom"));
        House.addRoom(new PurpleBedroom("Purple Bedroom", true));
        House.addRoom(new Kitchen("Blue Kitchen"));
        House.addRoom(new diningRoom("Yellow Dining Room"));
        System.out.println(House);
    }
}