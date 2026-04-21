public class OrangeBedroom extends Room{
    
    public OrangeBedroom(String roomName, boolean insideRoom, boolean outsideRoom){
        super(roomName, insideRoom, outsideRoom);
        
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Doesn't seem to be anything helpful...");
    }
}