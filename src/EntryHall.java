public class EntryHall extends Room {
    
    public EntryHall(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("Where should I start...Oh, it seems someone was waiting for me");
    } 
}
