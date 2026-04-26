public class room {
    
    public String roomName;

    public room(String roomName){
        this.roomName = roomName;

    }

    @Override
    public String toString(){
        return "This room is: " + this.roomName;
    }

    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
    }
}
