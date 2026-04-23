import java.util.Scanner;
import java.util.ArrayList;

public class GameLoop{
    
    Scanner userInput;
    ArrayList<Room> rooms;

    public GameLoop(){
        rooms = new ArrayList<Room>();
        userInput = new Scanner(System.in);
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    @Override
    public String toString(){
        String roomString = "Here are a list of rooms you can go to!";

        for(int i = 0; i < this.rooms.size(); i++){
            roomString += "\n  " + (i+1) + ". "+ this.rooms.get(i) + " (" + this.rooms.get(i) + ")";
        }
        return roomString;
    }

    public static void main(String[] args) {
        GameLoop House = new GameLoop();
        House.addRoom(new OrangeBedroom("Orange Bedroom", false, false));
        House.addRoom(new GreenBedroom("Green Bedroom", false, false));
        House.addRoom(new PurpleBedroom("Purple Bedroom", false, false));
        
    }
}