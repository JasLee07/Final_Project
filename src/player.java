import java.util.ArrayList;
public class Player extends Character {

    ArrayList<Item> items;
    
    public Player(String name, int age, String currentRoom){
        super(name, age, currentRoom);
        items = new ArrayList<Item>();
    }

    public void Move(String currentRoom){
        roomName = currentRoom;
        System.out.println("You are now in: " + roomName);
        System.out.println("You can inspect and look around here.");
    }

    public void addToInventory(Item n){
        items.add(n);
    }
}
