import java.util.ArrayList;
public class player extends Character {

    ArrayList<item> items;
    
    public player(String name, String currentRoom){
        super(name, currentRoom);
        items = new ArrayList<item>();
    }

    public void Move(String currentRoom){
        roomName = currentRoom;
        System.out.println("You are now in: " + roomName);
        System.out.println("You can inspect and look around here.");
    }

    public void addToInventory(item n){
        items.add(n);
    }
}
