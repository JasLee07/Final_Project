public class diningRoom extends room {
    
    public diningRoom(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh, looks like something was left on the table");
    }
}
