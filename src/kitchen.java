public class Kitchen extends Room {

    public Kitchen(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh, looks like I can talk to someone over there.");
    }
    
}
