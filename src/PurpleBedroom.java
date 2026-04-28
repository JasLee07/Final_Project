public class purpleBedroom extends room {

    public boolean hasBody;

    public purpleBedroom(String roomName, boolean hasBody){
        super(roomName);
        this.hasBody = true;
    }
    
    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Wait...is that-");
        System.out.println("You've discovered...a bloody body");
    }
}
