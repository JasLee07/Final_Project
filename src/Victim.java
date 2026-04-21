public class Victim extends Character{

    public Victim(String name, int age, String roomName){
        super(name, age, roomName);
    }

    public void Interact(){
        System.out.println("...");
        System.out.println("They're...gone");
    }
    
    public static void main(String[] args) {
        Victim Brock = new Victim("Brock", 26, "PurpleBedroom");
        Brock.Interact();
    }
}
