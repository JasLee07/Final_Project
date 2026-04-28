public class greenBedroom extends room{

    public greenBedroom(String roomName){
        super(roomName);
    }

    @Override
    public void Inspect(){
        System.out.println("I wonder if there's anything in here...");
        System.out.println("Oh! Looks like something was left in here (Green Letter)");
    }
}
