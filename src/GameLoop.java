import java.util.Scanner;
import java.util.ArrayList;

public class gameLoop{
    
    Scanner userInput;
    ArrayList<room> rooms;
    ArrayList<npc> npcs;
    ArrayList<item> items;
    player player;
    boolean isRunning;


    public gameLoop(){
        rooms = new ArrayList<room>();
        userInput = new Scanner(System.in);
        npcs = new ArrayList<npc>();
        items = new ArrayList<item>();
        this.isRunning = true;
    }

    public void addRoom(room r){
        rooms.add(r);
    }

    public void addnpc(npc n){
    npcs.add(n);
    }

    public void additem(item i){
        items.add(i);
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
        additem(new teacup("Green teacup", "Burgunday Common Room"));
        additem(new flashlight("Blue flashlight", "Yellow Dining Room", false));
        additem(new letter("Green Letter", "Green Bedroom"));
        System.out.println("Please enter your name:");
        String playerName = userInput.nextLine();
        player = new player(playerName, "Entry Hall");
    }

    public void showOptions(){
        System.out.println("Move to room");
        System.out.println("Inspect room");
        System.out.println("Talk to someone");
        System.out.println("Check inventory");
        System.out.println("Quit");
        System.out.println("Accuse someone");
        System.out.println("Pick up item");
    }

    public void takeTurn(){
        System.out.println("You are currently in: " + player.roomName);
        showOptions();
        String input = userInput.nextLine();
        if(input.equals("1")){
            System.out.println(toString());
            System.out.println("Where would you like to go?");
            String roomChoice = userInput.nextLine();
            int index = Integer.parseInt(roomChoice) - 1;
            player.Move(rooms.get(index).roomName);
        }
        else if(input.equals("2")){
            for (room r : rooms) {
                if (r.roomName.equals(player.roomName)) {
                    r.Inspect();
                }
            }
            }
        else if(input.equals("3")){
                boolean foundSomeone = false;
                for(npc n : npcs){
                    if(n.roomName.equals(player.roomName)){
                        n.interact();
                        foundSomeone = true;
                    }
                }
                if(!foundSomeone){
                    System.out.println("There is no one here to talk to.");
                }
            }
        else if(input.equals("4")){
            if(player.items.isEmpty()){
                System.out.println("Empty");
            }else{
                for(item i : player.items){
                    System.out.println(i);
                }
            }
            }
        else if(input.equals("5")){
            isRunning = false;
            }
        else if(input.equals("6")){
            for(npc n : npcs){
                System.out.println(n.toString());
            }
            System.out.println("Who did it?!");
            String userChoice = userInput.nextLine();
            if(userChoice.equals("Brian"))
            {
                System.out.println("You solved the murder!");
                isRunning = false;
            } else{
                System.out.println("Try investigating more");
            }
            
        }
        else if(input.equals("7")){
            boolean foundItem = false;
            for(int i = 0; i < items.size(); i++){
                if(items.get(i).roomName.equals(player.roomName)){
                    System.out.println((i+1) + ". " + items.get(i).description);
                    foundItem = true;
                }
            }
            if(!foundItem){
                System.out.println("There is nothing here to pick up.");
            } else {
                System.out.println("What would you like to pick up?");
                String itemChoice = userInput.nextLine();
                for(item currentItem : items){
                    if(currentItem.roomName.equals(player.roomName) && currentItem.description.equalsIgnoreCase(itemChoice)){
                    currentItem.pickUp();
                    player.addToInventory(currentItem);
                    boolean pickedUp = true;
                    }
                }       
                // int index = Integer.parseInt(itemChoice) - 1;
                // items.get(index).pickUp();
                // player.addToInventory(items.get(index));
                // items.get(index).roomName = "inventory";
            }
        }
        else{
            System.out.println("Invalid option");
        }
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
