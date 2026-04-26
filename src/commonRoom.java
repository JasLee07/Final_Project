public class commonRoom extends Room {
    
    public commonRoom(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh, looks like someone is here.");
        System.out.println("Oh, it seems there's a flashlight here...could be useful.");
    }
}
