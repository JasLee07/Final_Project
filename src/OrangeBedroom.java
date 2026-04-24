public class OrangeBedroom extends Room{
    
    public OrangeBedroom(String roomName){
        super(roomName);
        
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh, seems there's someone here. I should go talk to them.");
    }
}