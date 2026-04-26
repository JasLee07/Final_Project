public class greenBedroom extends Room{

    public greenBedroom(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh! Looks like something was left in here");
    }

    public static void main(String[] args) {
        greenBedroom greenBedroom = new greenBedroom("Green Bedroom");
        greenBedroom.Inspect();
        Letter greenLetter = new Letter("Green Letter");
        greenLetter.pickUp();
        greenLetter.read();
    }
}
