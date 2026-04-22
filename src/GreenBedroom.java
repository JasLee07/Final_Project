public class GreenBedroom extends Room{

    public GreenBedroom(String roomName, boolean insideRoom, boolean outsideRoom){
        super(roomName, insideRoom, outsideRoom);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh! Looks like something was left in here");
    }

    public static void main(String[] args) {
        GreenBedroom greenBedroom = new GreenBedroom("Green Bedroom", false, true);
        greenBedroom.OpenDoor();
        greenBedroom.Inspect();
        Letter greenLetter = new Letter("Green Letter");
        greenLetter.pickUp();
        System.out.println(greenLetter.read());
    }
}
