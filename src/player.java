import java.util.ArrayList;
public class Player extends Character {

    ArrayList<String> Items = new ArrayList<>();
    
    public Player(String name, int age, String currentRoom, ArrayList<String> Items){
        super(name, age, currentRoom);
        this.Items = Items;
    }

    public void Move(String currentRoom){

    }

    public void addToInventory(ArrayList<String> Items){

    }
}
