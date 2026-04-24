public class diningRoom extends Room {
    
    public diningRoom(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh, looks like something was left on the table");
    }

    public static void main(String[] args) {
        diningRoom myDiningRoom = new diningRoom("Red Dining Room");

        myDiningRoom.Inspect();
        Teacup greenteacup = new Teacup("Green Teacup");
        greenteacup.pickUp();
        greenteacup.Smell();
        greenteacup.putDown();
    }
}
