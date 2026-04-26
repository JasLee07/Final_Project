public class entryHall extends Room {
    
    public entryHall(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("Where should I start...Oh, it seems someone was waiting for me");
    } 
}
