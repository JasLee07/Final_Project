public class Room {
    
    public String roomName;
    public boolean insideRoom;
    public boolean outsideRoom;

    public Room(String roomName, boolean insideRoom, boolean outsideRoom){
        this.roomName = roomName;
        this.insideRoom = insideRoom;
        this.outsideRoom = outsideRoom;
    }

    @Override
    public String toString(){
        return "This room is: " + this.roomName;
    }

    public void OpenDoor(){
        insideRoom = true;
        System.out.println("You are inside: " + this.roomName);
    }

    public void CloseDoor(){
        insideRoom = false;
        System.out.println("You are leaving: " + this.roomName);
    }

    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
    }

}
