public class EntryHall extends Room {
    
    public EntryHall(String roomName, boolean insideRoom, boolean outsideRoom){
        super(roomName, insideRoom, outsideRoom);
    }

    @Override
    public void Inspect(){
        System.out.println("Where should I start...Oh, it seems someone was waiting for me");
    } 
}
