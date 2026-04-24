public class PurpleBedroom extends Room {

    public boolean hasBody;

    public PurpleBedroom(String roomName, boolean hasBody){
        super(roomName);
        this.hasBody = true;
    }
    
    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Wait...is that-");
        System.out.println("You've discovered...a bloody body");
    }

    public static void main(String[] args) {
        PurpleBedroom purpleBedroom = new PurpleBedroom("Purple Bedroom", true);
        purpleBedroom.Inspect();
        System.out.println("I need to figure out what's going on.");
    }
}
