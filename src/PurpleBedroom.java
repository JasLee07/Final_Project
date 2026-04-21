public class PurpleBedroom extends Room {

    public boolean hasBody;

    public PurpleBedroom(String roomName,  boolean insideRoom, boolean outsideRoom){
        super(roomName, insideRoom, outsideRoom);
        this.hasBody = true;
    }
    
    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Wait...is that-");
        System.out.println("You've discovered...a bloody body");
    }
}
