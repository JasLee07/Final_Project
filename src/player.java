import java.util.ArrayList;
public class Player extends Character {

    ArrayList<Item> items;
    
    public Player(String name, int age, String currentRoom, ArrayList<Item> items){
        super(name, age, currentRoom);
        this.items = items;
    }

    public void Move(String currentRoom){
        currentRoom = roomName;
        System.out.println("You are now in: " + roomName);
        System.out.println("You can inspect and look around here.");
    }

    public void addToInventory(Item item){

    }
}
